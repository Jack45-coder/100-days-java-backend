package project;

import java.util.Set;

public class User {
    private String name;
    private boolean isActive;
    private Set<String> roles;

    public User(String name, boolean isActive, Set<String> roles) {
        this.name = name;
        this.isActive = isActive;
        this.roles = roles;
    }

    public String getName() {
        return name;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public boolean isActive() {
        return isActive;
    }
}
