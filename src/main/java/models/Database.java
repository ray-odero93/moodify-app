package models;

import org.sql2o.Sql2o;

public class Database {
//    To run app locally
//     public static String connectionString = "jdbc:postgresql://localhost:5432/moodify";
//  public static    Sql2o sql2o = new Sql2o(connectionString, "moringa", "Access1");

   public static Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-54-209-52-160.compute-1.amazonaws.com:5432/dc6f25aurj2og1?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", "aeaifhkmlscqbq","62a0f1526bdb16862d49cfc45f39d30672ef4b703dc86c2853e8dbfcd53d14f2");

}
