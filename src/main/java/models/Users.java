package models;

import java.util.Objects;

public class Users {

    public String name;
    public String username;
    public String email;
    public String password;
    private int id;

    public Users(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(name, users.name) &&
                Objects.equals(username, users.username) &&
                Objects.equals(email, users.email) &&
                Objects.equals(password, users.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, name, email, id, password);
    }

}
