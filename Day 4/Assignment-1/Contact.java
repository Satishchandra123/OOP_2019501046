 /**
 * This class discusses about the Contact Object.
 * The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 *
 * @author Siva Sankar
 */

public class Contact {
    /**
     * .
     */
    private String name;
    /**
     * .
     */
    private String email;
    /**
     * .
     */
    private String phoneNumber;
    /**
     * @param name1  .
     * @param email1  .
     * @param phoneNumber1  .
     */
    public Contact(final String name1, final String email1,
    final String phoneNumber1) {
        this.name = name1;
        this.email = email1;
        this.phoneNumber = phoneNumber1;
    }
    /**
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }
    /**
     *
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     *
     * @return email
     */
    public String getEmail() {
        return this.email;
    }
    /**
     *
     * @param email1 .
     */
    public void setEmail(final String email1) {
        this.email = email1;
    }
    /**
     *
     * @param name1 .
     */
    public void setName(final String name1) {
        this.name = name1;
    }
    /**
     * @param phonenumber1 .
     */

    public void setPhoneNumber(final String phonenumber1) {
        this.phoneNumber = phonenumber1;
    }
    /**
     * @return .
     */
    public String toString() {
        return "{ Name = " + this.name + ", Email = " + this.email
        + ", Phone Number = " + this.phoneNumber + " }";

    }
}
