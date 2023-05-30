import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SILab2Test {

    @Test
    public void testEveryBranch() {
        // Test case 1
        User user1 = new User("user1", "password1", "email1@test.com");
        List<User> allUsers1 = new ArrayList<>();
        boolean result1 = SILab2.function(user1, allUsers1);
        assertTrue(result1);

        // Test case 2
        User user2 = new User(null, "password2", "email2@test.com");
        List<User> allUsers2 = new ArrayList<>();
        try {
            SILab2.function(user2, allUsers2);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 3
        User user3 = new User("user3", "password3", null);
        List<User> allUsers3 = new ArrayList<>();
        try {
            SILab2.function(user3, allUsers3);
            fail("Expected RuntimeException to be thrown");
        } catch (RuntimeException e) {
            assertEquals("Mandatory information missing!", e.getMessage());
        }

        // Test case 4
        User user4 = new User("user4", "password4", "email4@test.com");
        List<User> allUsers4 = new ArrayList<>(Arrays.asList(user4));
        boolean result4 = SILab2.function(user4, allUsers4);
        assertFalse(result4);
    }

    @Test
    public void testMultipleCondition() {
        // Test case 1
        User user1 = new User("user1", "password1", "email1@test.com");
        List<User> allUsers1 = new ArrayList<>();
        boolean result1 = SILab2.function(user1, allUsers1);
        assertTrue(result1);

        // Test case 2
        User user2 = new User("user2", "password2", "email2@test.com");
        List<User> allUsers2 = new ArrayList<>(Arrays.asList(user2));
        boolean result2 = SILab2.function(user2, allUsers2);
        assertFalse(result2);

        // Test case 3
        User user3 = new User("user3", "password3", "email3@test.com");
        List<User> allUsers3 = new ArrayList<>(Arrays.asList(user3, user3));
        boolean result3 = SILab2.function(user3, allUsers3);
        assertFalse(result3);

        // Test case 4
        User user4 = new User("user4", "password4", "email4@test.com");
        List<User> allUsers4 = new ArrayList<>();
        boolean result4 = SILab2.function(user4, allUsers4);
        assertFalse(result4);
    }
}
