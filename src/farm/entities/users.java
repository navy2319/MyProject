package farm.entities;

import javax.persistence.*;

/**
 * Created by scheffs on 3/10/2016.
 */
public class Users {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;

    public Users() {
    }

    public Users(int userId, String firstName, String lastName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + userId +
                ", First name='" + firstName + '\'' +
                ", Last name='" + lastName + '\'' +
                ", emailAddress='" + email + '\'' +
                '}';
    }
}

