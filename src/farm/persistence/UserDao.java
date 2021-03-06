package farm.persistence;

import farm.entities.Users;
import org.apache.log4j.Logger;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

/**
 * Created by scheffs on 5/10/2016.
 */
public class UserDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method adds a user
     *
     * @param users the user to be added
     * @return the user id of the user added
     */
    public int addUser(Users users) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;

        try {
            tx = session.beginTransaction();
            userId = ((Integer) session.save(users)).intValue();
            tx.commit();
            log.info("Added User with id " + userId);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return userId;
    }

    /**
     * This method deletes an user
     *
     * @param users the user to be deleted
     */
    public void deleteUser(Users users) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.delete(users);

            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    /**
     * This method gets a user
     *
     * @param userName the username of the user you are trying to get
     * @return the user with the userName
     */
    public Users getUserByUserName(String userName) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Users users = null;

        try {
            tx = session.beginTransaction();

            Criteria criteria = session.createCriteria(Users.class);
            criteria.add(Restrictions.eq("userName", userName));
            Users user = (Users) criteria.uniqueResult();
            session.close();
            return user;

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } catch (IndexOutOfBoundsException e) {
            log.debug("No user with this username found!");

            return null;
        }finally {
            session.close();
        }


        return users;
    }

}
