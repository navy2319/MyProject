package farm.persistence;

import farm.entities.Members;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 * Created by scheffs on 5/12/2016.
 */
public class MembersDao {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method adds a user
     *
     * @param members the user to be added
     * @return the user id of the user added
     */
    public int addMembers(Members members) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer memberId = null;

        try {
            tx = session.beginTransaction();
            memberId = ((Integer) session.save(members)).intValue();
            tx.commit();
            log.info("Added Member with id " + memberId);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return memberId;
    }

    /**
     * This method deletes an user
     *
     * @param members the user to be deleted
     */
    public void deleteMember(Members members) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            session.delete(members);

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
     * @param firstName the username of the user you are trying to get
     * @return the user with the userName
     */
    public Members getUserByFirstName(String firstName) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Members members = null;

        try {
            tx = session.beginTransaction();

            Criteria criteria = session.createCriteria(Members.class);
            criteria.add(Restrictions.eq("firstName", firstName));
            //Members members = (Members) criteria.uniqueResult();
            session.close();
            return members;

        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } catch (IndexOutOfBoundsException e) {
            log.debug("No user with this firstname found!");

            return null;
        }finally {
            session.close();
        }


        return members;
    }
}
