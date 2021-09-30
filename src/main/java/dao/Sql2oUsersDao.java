package dao;

import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class Sql2oUsersDao implements UsersDao {

    private final Sql2o sql2o;
    public Sql2oUsersDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Users users) {
        String sql = "INSERT INTO users(name,username,email,password) VALUES (:name,:username,:email,:password)";
        try (Connection conn = sql2o.open()) {
            int id = (int) conn.createQuery(sql, true)
                    .bind(users)
                    .executeUpdate()
                    .getKey();
            users.setId(id);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @Override
    public Users findById(int id) {
        try (Connection conn = sql2o.open()) {
            String sql = ("SELECT * FROM users WHERE id=:id");
            return conn.createQuery(sql)
                    .addParameter("id", id)
                    .executeAndFetchFirst(Users.class);
        }
    }

    @Override
    public void deleteById(int id) {
        String sql = "DELETE FROM users WHERE id=:id";
        try(Connection conn=sql2o.open()) {
            conn.createQuery(sql,true)
                    .addParameter("id",id)
                    .executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }



}
