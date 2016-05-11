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

    public Users() {
    }

    public Users(int userId, String userName, String userPassword, String lastName, String firstName) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**/
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

