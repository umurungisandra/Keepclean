package rw.minaloc.mint.keepclean.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamonyo on 23/08/2017.
 */

public class Role {
    private String role;
    private String description;
    private List<User> users = new ArrayList<User>();

    public Role(){}

    public Role(String role){
        this.role = role;
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

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public List<User> getUsers(){
        return this.users;
    }

    @Override
    public int hashCode() {
        if (this.getRole() == null)
            return super.hashCode();
        return this.getRole().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Role) || role == null)
            return false;
        return role.equals(((Role) obj).getRole());
    }

    @Override
    public String toString() {
        return "ROLE: " + this.getRole() + "; DESC: " + this.getDescription();
    }
}
