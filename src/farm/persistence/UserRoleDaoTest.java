package farm.persistence;

import org.junit.Test;
import farm.entities.UserRoles;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by scheffs on 5/7/2016.
 */
public class UserRoleDaoTest {

    UserRoleDao dao = new UserRoleDao();

    @Test
    public void testAddUserRoleAndSelectUserRole() {
        UserRoles userRoles = new UserRoles("test", "tester");

        dao.addUserRole(userRoles);

        UserRoles userRole1 = dao.getUserRolesFor("test").get(0);

        assertTrue(userRoles.getUserName().equals(userRole1.getUserName()));

        dao.deleteUserRole(userRoles);
    }

    @Test
    public void testDeleteUserRole() {
        UserRoles userRole = new UserRoles("test", "tester");

        dao.addUserRole(userRole);

        dao.deleteUserRole(userRole);

        ArrayList<UserRoles> userRoles = dao.getUserRolesFor("test");

        assertTrue(userRoles.size() == 0);

    }
}
