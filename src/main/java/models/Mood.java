package models;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
public abstract class Mood {

    Sql2o sql2o = new Sql2o("jdbc:postgresql://ec2-44-198-223-154.compute-1.amazonaws.com:5432:5432/daa7t7lmet2sou?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", "zmpkonnizwzucd", "c795ec211f480b77e7d471dbf87206d4dce5b428b0f59f062fb4da72c5bda9f3");
    public int id;
    public byte appimage;
    public String appname;
    public String appinfo;
    public String downloads;
    public String moodtype;
    public String rating;

//    public int id;
//    public byte appimage;
//    public String appname;
//    public String appinfo;
//    public String downloads;
//    public String rating;
//    public String moodtype;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mood mood = (Mood) o;
        return Objects.equals(appimage, mood.appimage) &&
                Objects.equals(appname, mood.appname) &&
                Objects.equals(appinfo, mood.appinfo) &&
                Objects.equals(downloads, mood.downloads) &&
                Objects.equals(moodtype, mood.moodtype)&&
                Objects.equals(rating, mood.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appimage,appname, appinfo, downloads, moodtype,rating);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppinfo() {
        return appinfo;
    }

    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo;
    }

    public String getDownloads() {
        return downloads;
    }

    public void setDownloads(String age) {
        this.downloads = downloads;
    }
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }




    public String getMoodtype() {
        return moodtype;
    }

    //  DAO
    public void save() {
        try (Connection con = Database.sql2o.open()) {
            String sql = "INSERT INTO moods(appname,appinfo, downloads, moodtype,rating) values (:appname,:appinfo,:downloads,:moodtype,:rating)";
            this.id = (int) con.createQuery(sql, true)
//                    .addParameter("appimage", this.appimage)
                    .addParameter("appname", this.appname)
                    .addParameter("appinfo", this.appinfo)
                    .addParameter("downloads", this.downloads)
                    .addParameter("moodtype", this.moodtype)
                    .addParameter("rating", this.rating)
                    .executeUpdate()
                    .getKey();
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    public static List<String> allMoodNames() {
        try (Connection con = Database.sql2o.open()) {
            return con.createQuery("SELECT name FROM moods")
                    .executeAndFetch(String.class);
        }
    }
}

