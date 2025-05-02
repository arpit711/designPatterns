package makeMyTripPracticeLLD;

import jdk.dynalink.beans.StaticClass;

import java.util.stream.Stream;

public class User {
    private final String name;
    private final String userId;
    private final String userAddress;

    public User(String name, String userId, String userAddress) {
        this.name = name;
        this.userId = userId;
        this.userAddress = userAddress;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserAddress() {
        return userAddress;
    }
}
