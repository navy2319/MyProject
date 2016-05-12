import farm.persistence.UserRoleDao;
import org.junit.Test;
import farm.entities.UserRoles;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by scheffs on 5/7/2016.
 */
public class UserRoleDaoTest {

    @Test
    public void testAddUserRole() {
        UserRoleDao userRoleDao = new UserRoleDao();

        UserRoles userRoles = new UserRoles();
        userRoles.setUserName("My name");
        userRoles.setRoleName("admin");

        String roleName = userRoleDao.addUserRole(userRoles);
        assertTrue(roleName == "Test Password");
    }

    @Test
    public void testDeleteUserRole() {
        UserRoleDao userRoleDao = new UserRoleDao();

        UserRoles userRoles = new UserRoles();
        userRoles.setUserName("My name");
        userRoles.setRoleName("admin");

        assertTrue(userRoleDao.getUserRolesFor("admin") == null);
        userRoleDao.deleteUserRole(userRoles);

    }
}
