package dao;

import models.Login;
import org.junit.Test;

import static org.junit.Assert.*;

public class Sql2oLoginDaoTest {

    private Sql2oLoginDao loginDao;

    //addingLoginSetsId()
    @Test
    public void add() throws Exception {
            Login testLogin = setupLogin();
            assertEquals(1, testLogin.getId());
    }

    @Test
    public void findById() throws Exception{
    }

    @Test
    public void deleteById()  throws Exception {
        Login testLogin = setupLogin();
        Login otherLogin = setupLogin();
        assertEquals(2, loginDao.getAll().size());
        loginDao.deleteById(testLogin.getId());
        assertEquals(1, loginDao.getAll().size());
    }


    //helpers
    public Login setupLogin() {
        Login login = new Login("esther", "esther.moki@student.moringaschool.com", "moki");
        loginDao.add(login);
        return login;
    }
}

