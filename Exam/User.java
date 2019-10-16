import java.util.*;

public class User {
    public String userName;

    int size;
    
    String[] userConnections = new String[100];

    User(String userName) {
        this.userName = userName;
        size = 0;
    }
    User(String userName,String )
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
