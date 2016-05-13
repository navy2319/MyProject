import farm.entities.Members;
import farm.persistence.MembersDao;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by scheffs on 5/12/2016.
 */
public class MembersDaoTest {
    @Test
    public void testAddMembers() {
        MembersDao membersDao = new MembersDao();

        Members members = new Members();
        members.setFirstName("Test");
        members.setLastName("meeeee");
        members.setEmail("me@me.com");
        members.setMessage("meeeee allf  afjehguhg fji oefu hfh.");


        int memberId = membersDao.addMembers(members);
        //Need to check for the next user in the table and change the number before running the test
        assertTrue(memberId == 11);
    }

    @Test
    public void testDeleteMember() {
        MembersDao membersDao = new MembersDao();

        Members members = new Members();
        members.setFirstName("Test");
        members.setLastName("meeeee");

        assertTrue(membersDao.getMemberByFirstName("Test") == null);

        membersDao.deleteMember(members);
    }

    /*@Test
    public void testGetUserByUsername() {
        UserDao userDao = new UserDao();

        Users users = new Users();
        users.setUserName("test");
        users.setUserPassword("test");

        userDao.addUser(users);

        //Users user1 = userDao.getUserByUserName("test");
        String userName = userDao.getUserByUserName(userName);
        assertTrue(userName == "test");
        //assertTrue(userDao.getUserByUserName("test") == null);

        //userDao.deleteUser(users);

    }*/
}
