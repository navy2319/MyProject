package farm.persistence;

import farm.entities.UserRoles;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

/**
 * Created by scheffs on 5/3/2016.
 */
public class UserRoleDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * This method adds a user-role
     *
     * @param userRoles the user-role to be added
     */
    public String addUserRole(UserRoles userRoles) {
        Session session  = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        String roleName = null;

        try {
            tx = session.beginTransaction();
            roleName = ((String) session.save(userRoles));
            tx.commit();
            log.info("Added User with role name " + roleName);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return roleName;
    }

    /**
     * This method deletes a user role
     *
     * @param userRoles the user role to be deleted
     */
    public void deleteUserRole(UserRoles userRoles) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            session.delete(userRoles);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }

    }

    /**
     * This method gets the user roles for the username
     *
     * @param userName the username that you want roles for
     * @return the user-roles for the username
     */
    public ArrayList<UserRoles> getUserRolesFor(String userName) {
        ArrayList<UserRoles> userRoles = new ArrayList<UserRoles>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();


        Query query = session.createQuery("from UserRoles where userName = :searchTerm");
        query.setParameter("searchTerm", userName);

        userRoles = (ArrayList<UserRoles>) query.list();

        session.close();

        return userRoles;
    }
}
