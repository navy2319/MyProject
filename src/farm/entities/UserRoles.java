package farm.entities;

/**
 * Created by scheffs on 5/6/2016.
 */
public class UserRoles {

    private String userName;
    private String roleName;

    /**
     * constructor to set all values
     *
     * @param userName the userName
     * @param roleName the roleName
     */
    public UserRoles(String userName, String roleName) {
        this.userName = userName;
        this.roleName = roleName;
    }

    /**
     * default empty constructor
     */
    public UserRoles() {
        userName = "";
        roleName = "";
    }


    /**
     * Gets roleName.
     *
     * @return Value of roleName.
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets new userName.
     *
     * @param userName New value of userName.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Sets new roleName.
     *
     * @param roleName New value of roleName.
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUserName() {
        return userName;
    }
}

