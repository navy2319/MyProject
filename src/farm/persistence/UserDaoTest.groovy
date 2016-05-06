package farm.persistence

import farm.entities.Users
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by scheffs on 5/6/2016.
 */
class UserDaoTest{
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
        user.setFirstName("Unit");
        user.setLastName("Test");
        user.setEmail("UnitTester2@gmail.com");

        insertedUserId = dao.addUser(user);

        assertTrue(insertedUserId > 0);
        dao.deleteUser(user);


    }
}
