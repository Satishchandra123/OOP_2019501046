import java.util.*;

public class User {
    private String userName;

    private int  numberofConnections;
    
    private String[] userConnections;

    User(String userName, int numberofConnections, String userConnections) {
        this.userName = userName;
        this.numberofConnections = numberofConnections;
        this.userConnections = userConnections;
    }
    public String getUserName() {
        return userName;
    }
    public String getNumberofConnections() {
        return numberofConnections;
    }
    public String getUserConnections() {
        return userConnections;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setNumberofConnections(String numberofConnections) {
        this.numberofConnections = numberofConnections;
    }
    public void setUserConnections(String userConnections) {
        this.userConnections = userConnections;
    }
    public String toString() {
        return (this.user + " is connected to " + this.userconnections); 
    }
}
