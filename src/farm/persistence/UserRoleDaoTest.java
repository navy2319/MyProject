package farm.persistence;

import org.junit.Test;
//import farm.entities.Users;
import farm.entities.UserRoles;

/**
 * Created by scheffs on 5/7/2016.
 */
public class UserRoleDaoTest {
    @Test
    public void testAddUserRole() {
        UserRoleDao userRoleDao = new UserRoleDao();
        UserRoles userRoles = new UserRoles();
        userRoles.setUserName("Naivi");
        userRoles.setRoleName("administrator");
        userRoleDao.addUserRoles(userRoles);
    }
}
