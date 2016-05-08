package farm.persistence;

import farm.entities.Users;
import farm.entities.UserRoles;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by scheffs on 5/3/2016.
 */
public class UserDao {

    private final Logger log = Logger.getLogger(this.getClass());


    public List<Users> getAllUsers() {

        List<Users> users = new ArrayList<>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            users = session.createCriteria(Users.class).list();
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return users;
    }

    public void updateUser(Users user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.saveOrUpdate(user);
            transaction.commit();
            log.info("User updated");
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }

    public void deleteUser(Users user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
            log.info("user deleted");
        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    public int addUser(Users user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;
        Integer userId = 0;

        try {
            transaction = session.beginTransaction();
            userId = (Integer) session.save(user);
            transaction.commit();
            log.info("Added user: " + userId);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }

        return userId;
    }

    private UserRoles createUserRole(Users user) {

        UserRoles userRoles = new UserRoles();
        userRoles.setUserName(user.getEmail());
        userRoles.setRoleName("user");
        return userRoles;
    }
}
