package farm.entities;

import javax.persistence.*;

/**
 * Created by scheffs on 3/10/2016.
 */
public class Users {

    private int userId;
    private String userName;
    private String userPassword;
    private String firstName;
    private String lastName;

    /**
     * Default constructor
     */
    public Users() {
    }

    /**
     * Constructor with params
     * @param userId userId
     * @param userName userName
     * @param userPassword userPassword
     * @param lastName lastName
     * @param firstName firstName
     */
    public Users(int userId, String userName, String userPassword, String lastName, String firstName) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**
     * Gets userID
     * @return userID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets userId
     * @param userId new value of userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * gets userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * sets userName
     * @param userName new value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * gets userPassword
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * sets userPassword
     * @param userPassword new userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * gets lastName
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets lastName
     * @param lastName new lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * gets firstName
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets firstName
     * @param firstName new firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

