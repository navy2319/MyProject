package farm.entities;

import javax.persistence.*;

/**
 * Created by scheffs on 3/10/2016.
 */
public class Users {

    private int userId;
    private String userName;
    private String userPassword;

    /**
     * Default constructor
     */
    public Users() {
    }

    /**
     * Constructor with more params
     *
     * @param userId userId
     * @param userName userName
     * @param userPassword userPassword
     */
    public Users(int userId, String userName, String userPassword) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    /**
     * Sets new username.
     *
     * @param userName New value of username.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets userId.
     *
     * @return Value of userId.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets new userId.
     *
     * @param userId New value of userId.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets username.
     *
     * @return Value of username.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets new password.
     *
     * @param userPassword New value of password.
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Gets password.
     *
     * @return Value of password.
     */
    public String getUserPassword() {
        return userPassword;
    }
}

