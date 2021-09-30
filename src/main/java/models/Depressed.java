package models;

import org.sql2o.Connection;

import java.util.List;

public class Depressed extends Mood{
    private static final String STATUS = "depressed";

    public Depressed( String appname, String appinfo, String downloads, String rating) {
       // this.appimage = appimage;
        this.appname = appname;
        this.appinfo = appinfo;
        this.downloads = downloads;
        this.moodtype = STATUS;
        this.rating = rating;
    }



    //DAO OPERATIONS
    public static List<Depressed> all(){
        String sql = "SELECT * FROM moods where moodtype=:moodtype";
        try(Connection con = Database.sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("moodtype", STATUS)
                    .executeAndFetch(Depressed.class);
        }
    }

    public static Depressed find(int searchId){
        String sql = "SELECT * FROM moods where (id=:id AND moodtype=:moodtype)";
        try(Connection con = Database.sql2o.open()) {
            return con.createQuery(sql)
                    .addParameter("id",searchId)
                    .addParameter("moodtype", STATUS)
                    .executeAndFetchFirst(Depressed.class);
        }
    }

}
