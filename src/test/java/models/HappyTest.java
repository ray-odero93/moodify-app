package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class HappyTest {
    private Happy newMood() {
        return new Happy("Instagram","Image App","Many", "good");
    }

    @Test
    public void mood_instantiatesCorrectly_true(){
        Happy happyMood = newMood();
        assertTrue(happyMood instanceof Happy);
    }

    @Test
    public void getName_returnMoodName(){
        Happy happyMood = newMood();
        assertEquals("Spotify", happyMood.getAppname());
    }

    @Test
    public void getAppInfo_returnAppINfo(){
        Happy happyMood = newMood();
        assertEquals("Great App", happyMood.getAppinfo());
    }

    @Test
    public void getRating_returnMoodRating(){
        Happy happyMood = newMood();
        assertEquals("Fun", happyMood.getRating());
    }

    @Test
    public void getStatus_returnMoodStatus(){
        Happy happyMood = newMood();
        assertEquals("happy", happyMood.getMoodtype());
    }

    @Test
    public void save_savedToDb_int(){
        Happy happyMood = newMood();
        happyMood.save();
        assertEquals(happyMood.getId(), Happy.all().get(0).getId());
    }

    @Test
    public void find_locateHappyMood_Name(){
        Happy happyMood = newMood();
        happyMood.save();
        Happy foundMood = Happy.find(happyMood.getId());
        assertTrue(happyMood.equals(foundMood));
    }

}
