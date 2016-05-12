package farm.entities;

/**
 * Created by scheffs on 3/10/2016.
 */


public class Members {

    private int memberId;
    private String firstName;
    private String lastName;
    private String email;
    private String message;

    /**
     * gets memberId
     * @return memberId
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * sets memberId
     * @param memberId new memberId
     */
    public void setMemberId(int memberId) {
        this.memberId = memberId;
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
     * gets email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets email
     * @param email new email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * sets message
     * @param message new message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
