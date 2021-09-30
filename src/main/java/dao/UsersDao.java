package dao;

import models.Users;
import org.sql2o.Sql2o;

import java.util.List;

public interface UsersDao {
    //create
    void add(Users users);

    //read
    Users findById(int id);


    //delete
    void deleteById(int id);
}
