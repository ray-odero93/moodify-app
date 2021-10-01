package dao;

import models.Login;
import models.Users;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oUsersDaoTest {
    private Sql2oUsersDao usersDao;

    //addingUsersSetsId()
    @Test
    public void add() throws Exception{
        Users testUsers = setupUsers();
        assertEquals(1, testUsers.getId());
    }

    @Test
    public void findById() throws Exception{
    }

    @Test
    public void deleteById() throws Exception{
        Users testUsers = setupUsers();
        Users otherUsers = setupUsers();

        assertEquals(2, usersDao.getAll().size());
        usersDao.deleteById(testUsers.getId());
        assertEquals(1, usersDao.getAll().size());
    }

    //helpers
    public Users setupUsers() {
        Users users = new Users("moki", "esther","esther.moki@student.moringaschool.com", "moki");
        usersDao.add(users);
        return users;
    }
}