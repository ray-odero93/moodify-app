//package models;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class SadTest {
//
//
//    private Sad newMood() {
//        return new Sad("Spotify","Music app","Millions","Fun");
//    }
//
//    @Test
//    public void mood_instantiatesCorrectly_true(){
//        Sad sadMood = newMood();
//        assertTrue(sadMood instanceof Sad);
//    }
//
//    @Test
//    public void getName_returnMoodsName(){
//        Sad sadMood = newMood();
//        assertEquals("Happy", sadMood.getAppname());
//    }
//
//    @Test
//    public void getAppInfo_returnAnimalsHealth(){
//        Sad sadMood = newMood();
//        assertEquals("Great app", sadMood.getAppinfo());
//    }
//
//    @Test
//    public void getRating_returnAnimalsAge(){
//        Sad sadMood = newMood();
//        assertEquals("Fun", sadMood.getRating());
//    }
//
//    @Test
//    public void getStatus_returnMoodStatus(){
//        Sad sadMood = newMood();
//        assertEquals("sad", sadMood.getMoodtype());
//    }
//
//    @Test
//    public void save_savedToDb_int(){
//        Sad sadMood = newMood();
//        sadMood.save();
//        assertEquals(sadMood.getId(), Sad.all().get(0).getId());
//    }
//
//    @Test
//    public void find_popularityOfSadMood_Name(){
//        Sad sadMood = newMood();
//        sadMood.save();
//        Sad foundAnimal = Sad.find(sadMood.getId());
//        assertEquals(sadMood,foundAnimal);
//    }
//
//}