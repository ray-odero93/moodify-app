package dao;

import models.Login;


public interface LoginDao {
    //create
    void add(Login login);

    //read
    Login findById(int id);


    //delete
    void deleteById(int id);

}