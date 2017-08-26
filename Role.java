package rw.mint.keepclean;

/**
 * Created by Shema on 8/22/2017.
 */

public class Role {
    String role;
    String description;

    public Role(String role, String description) {
        this.role = role;
        this.description = description;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
