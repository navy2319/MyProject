package farm.persistence;

import farm.entities.Users;
import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by naivischeffert on 5/6/16.
 */
public class UserDaoTest {

    @Test
    public void testGetAllUsers() throws Exception {

    }

    @Test
    public void testUpdateUser() throws Exception {

    }

    @Test
    public void testDeleteUser() throws Exception {

    }


    @Test
    public void testAddUser() throws Exception {
        UserDao dao = new UserDao();
        int insertedUserId = 0;
        //create user to add
        Users user = new Users();
        user.setFirstName("Naivi");
        user.setLastName("Scheffert");
        user.setEmail("java@gmail.com");

        insertedUserId = dao.addUser(user);

        assertTrue(insertedUserId > 0);
        dao.deleteUser(user);


    }
}

