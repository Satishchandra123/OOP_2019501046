/**
 * This class discusses about the Contact Object. The attributes of the contact object
 * are as follows.
 * name : Name of the person / friend.
 * email : mail id of the person / friend.
 * phoneNumber : Phone Number of the person / friend.
 * 
 * @author Siva Sankar
 */

//  Your code goes here... For Contact class
/**
 * Contact
 */
public class Contact {
    public String name;
    public String email;
    public String phoneNumber;
    public Contact(String name, String email, String phoneNumber)
    {
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;        
    }
    public String getName()
    {
        return this.name;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail( String email)
    {
        this.email=email;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setPhoneNumber(String phonenumber)
    {
        this.phoneNumber=phonenumber;
    }
    public String toString()
    {
        return "{ Name = "+this.name+", Email = "+ this.email+", Phone Number = "+this.phoneNumber+" }";

    }
}
