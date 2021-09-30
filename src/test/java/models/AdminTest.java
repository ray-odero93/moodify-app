//package models;
//
//import org.junit.Test;
//
//import java.sql.Timestamp;
//import java.text.DateFormat;
//import java.util.Date;
//
//import static org.junit.Assert.*;
//
//public class AdminTest {
//
//
//    private Admin newInput(){
//        return new Admin("Happy","Popular",1);
//    }
//
//    private Admin newInput2(){return new Admin("Sad","Popular",2);}
//
//    @Test
//    public void input_instantiatesCorrectly(){
//        Admin admin = newInput();
//        assertTrue(admin instanceof Admin);
//    }
//
//    @Test
//    public void getMoodlId_returnMoodName_true(){
//        Admin admin = newInput();
//        assertEquals("Happy", admin.getMoodName());
//    }
//
//    @Test
//    public void getPopularity_returnInputPopularity_true(){
//        Admin admin = newInput();
//        assertEquals("Happy", admin.getPopularity());
//    }
//
//    @Test
//    public void getUserId_returnUserId_true(){
//        Admin admin = newInput();
//        assertEquals(1, admin.getUserid());
//    }
//
//
//
//    @Test
//    public void save_savesInputIntoDB_true(){
//        Admin admin = newInput();
//        int idBefore = admin.getId();
//        admin.save();
//        assertNotEquals(idBefore, admin.getId());
//    }
//
//    @Test
//    public void find_searchForInput_true(){
//        Admin admin1 = newInput();
//        Admin admin2 = newInput2();
//        admin1.save();
//        admin2.save();
//        System.out.println();
//        assertTrue(Admin.find(admin2.getId()).equals(admin2));
//    }
//
//    @Test
//    public void all_getAllInputs_true(){
//        Admin admin1 = newInput();
//        Admin admin2 = newInput2();
//        admin1.save();
//        admin2.save();
//        assertTrue(Admin.all().contains(admin1));
//        assertTrue(Admin.all().contains(admin2));
//    }
//
//    @Test
//    public void all_getAllPopularities_true(){
//        Admin admin1 = newInput();
//        Admin admin2 = newInput2();
//        admin1.save();
//        admin2.save();
//        assertEquals(2, Admin.getAllPopularities().size());
//    }
//
//    @Test
//    public void filter_getInputInSinglePopularity_true(){
//        Admin admin1 = newInput();
//        Admin admin2 = newInput2();
//        Admin admin3 = new Admin("Tired","Not popular",3);
//        admin1.save();
//        admin2.save();
//        admin3.save();
//        assertTrue(Admin.getAllAdminsInPopularity("Popular").contains(admin1));
//        assertTrue(Admin.getAllAdminsInPopularity("Not Popular").contains(admin3));
//    }
//
//
//
//
//
//
//}
