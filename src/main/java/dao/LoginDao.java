package dao;

import models.Login;
import models.Users;

import java.util.Collection;
import java.util.List;


public interface LoginDao {

    //create
    void add(Login login);

    //read
    List<Login> getAll();
    Login findById(int id);


    //delete
    void deleteById(int id);

}