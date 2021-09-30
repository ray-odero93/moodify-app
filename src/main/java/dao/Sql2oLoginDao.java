package dao;

import models.Login;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Sql2oLoginDao implements LoginDao{
    private final Sql2o sql2o;
    public Sql2oLoginDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Login login) {
        String sql = "INSERT INTO login(username,email,password) VALUES (:username,:email,:password)";
        try (Connection conn = sql2o.open()) {
            int id = (int) conn.createQuery(sql, true)
                    .bind(login)
                    .executeUpdate()
                    .getKey();
            login.setId(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }



    @Override
    public Login findById(int id) {
        try (Connection conn = sql2o.open()) {
            String sql = ("SELECT * FROM login WHERE id=:id");
            return conn.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Login.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM login WHERE id=:id";
        try(Connection conn=sql2o.open()) {
            conn.createQuery(sql,true)
                    .addParameter("id",id)
                    .executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }



}
