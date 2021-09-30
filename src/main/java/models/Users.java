package models;

public class Users {

    public String name;
    public String username;
    public String email;
    public String password;
    private int id;

    public Users(String name,String username,String email,String password){
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
}
