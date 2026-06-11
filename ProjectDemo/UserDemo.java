package ProjectDemo;

import java.util.*;

public class UserDemo {
    private String name;
    private boolean active;
    private HashSet<String> roles;

    public UserDemo(String name, boolean active, HashSet<String> roles) {
        this.name = name;
        this.active = active;
        this.roles = roles;

    }

    // getters
    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;

    }

    public HashSet<String> getRoles() {
        return roles;
    }

}
