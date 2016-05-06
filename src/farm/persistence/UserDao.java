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
        List<Users> users = new ArrayList<Users>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        session.createCriteria(Users.class).list();
        return users;
    }

    public void updateUser(Users user) {

    }

    public void deleteUser(Users user) {
        AbstractDao dao = new AbstractDao(Users.class);
        dao.delete(user);
    }

    public int addUser(Users user) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;
        try {
            tx = session.beginTransaction();
            userId = (Integer) session.save(user);
            session.save(createUserRole(user));
            tx.commit();
            log.info("Added user: " + user + " with id of: " + userId);
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
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
