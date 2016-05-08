package farm.persistence;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;
import farm.entities.Users;
import farm.persistence.UserDao;

/**
 * Created by scheffs on 5/3/2016.
 */
public class UserRoleDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public void addUserRole(UserRoleDao userRole) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Transaction transaction = null;
        String userName = null;

        try {
            transaction = session.beginTransaction();
            userName = (String) session.save(userRole);
            transaction.commit();
            log.info("Added user: " + userName);

        } catch (HibernateException e) {
            if (transaction != null) transaction.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }
}
