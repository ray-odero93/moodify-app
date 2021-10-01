import dao.Sql2oLoginDao;
import dao.Sql2oUsersDao;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

public class App {
    public static void main(String[] args) {
        Sql2oUsersDao usersDao;
        Sql2oLoginDao LoginDao;
        Connection conn;


        String connectionString = "jdbc:h2:~/users_information.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");
        usersDao = new Sql2oUsersDao(sql2o);
        LoginDao = new Sql2oLoginDao(sql2o);
        conn = sql2o.open();


    }

}