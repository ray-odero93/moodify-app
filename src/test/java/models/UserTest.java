//package models;//import models.Ranger;
//import dao.UserDao;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//@SuppressWarnings("ConstantConditions")
//public class UserTest {
//
//
//
//    private User newUser(){
//        return new User("Wendy");
//    }
//
//    @Test
//    public void ranger_instantiatesCorrectly(){
//        User user = newUser();
//        assertTrue(user instanceof User);
//    }
//
//    @Test
//    public void getName_returnUserName_true(){
//        User user = newUser();
//        assertEquals("Wendy", user.getName());
//    }
//
//    @Test
//    public void save_getUserId(){
//        User user = newUser();
//        int idBefore = user.getId();
//        user.save();
//        assertNotEquals(idBefore, user.getId());
//    }
//
//    @Test
//    public void all_getAllUsers(){
//        User user = newUser();
//        User user1 = new User("Stark");
//        user.save();
//        user1.save();
//        assertTrue(UserDao.all().contains(user));
//        assertTrue(UserDao.all().contains(user1));
//    }
//
//    @Test
//    public void find_getParticularUser(){
//        User user = newUser();
//        User user1 = new User("Alice");
//        user.save();
//        user1.save();
//        assertTrue(UserDao.find(user.getId()).equals(user));
//    }
//
//    @Test
//    public void add_preventDuplicateUser(){
//        User user1 = newUser();
//        User user2 = newUser();
//        user1.save();
//        user2.save();
//        for(User user : UserDao.all()){
//            if (user2.equals(user)){
//                user2.delete();
//                break;
//            }
//        }
//        assertEquals(1, UserDao.all().size());
//    }
//
//}