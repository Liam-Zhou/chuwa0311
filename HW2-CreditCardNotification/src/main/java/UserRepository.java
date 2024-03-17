import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static final List<User> users = new ArrayList<>();
    public static List<User> getAllUsers() {
        // Add users to the list
        users.add(new User("Brian", "Brian.Yu@google.com", "1234567890", "WhatsBrian", "EMAIL"));
        users.add(new User("Joanna", "Joanna@google.com", "0987654321", "WhatsJoanna","SMS"));
        return users;
    }
}
