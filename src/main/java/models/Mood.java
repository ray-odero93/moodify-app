package models;

public class Mood {
    private String mood;
    private int id;

    public Mood(String mood, int id) {
        this.mood = mood;
        this.id = id;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
