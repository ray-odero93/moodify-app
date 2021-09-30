package models;

public class Login {
    public String username;
    public String email;
    public String password;
    private int id;

    public Login(String username,String email,String password){
        this.username = username;
        this.email = email;
        this.password = password;

    }
    public void setId(int id) {
        this.id = id;
    }
}


