package farm.entities;

import javax.persistence.*;

/**
 * Created by scheffs on 3/10/2016.
 */
@Entity
public class Users {
    private int userId;
    private String firstName;
    private String lastName;
    private String email;

    //Empty Constructor
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

    //@Basic
    //@Column(name = "email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != users.userId)
            return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null)
            return false;
        if (email != null ? !email.equals(users.email) : users.email != null)
            return false;

        return true;
    }
}
