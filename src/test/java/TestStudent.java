import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.time.*;

public class TestStudent {
    private final String name = "Enda Kilgarriff";
    private final String dob = "01/05/1999";
    private final int age = 21;
    Student s1 = new Student(name, age, dob);

    @Test
    public void testStudentCreation(){
        assertEquals(name, s1.getName());
    }

    @Test
    public void testGetUsername(){
        assertEquals(s1.getUserName(), "Enda Kilgarriff21");
    }

    @Test
    public void testGetDob() {
        LocalDate testDob = LocalDate.of(1999,5, 1);
        assertEquals(s1.getDob(), testDob);
    }

    @Test
    public void testGetID(){
        // Only one student created. S1 ID must be 1
        assertEquals(s1.getId(), 1);
    }

    @Test
    public void testUpdateUserName(){
        String newUsername = "EndaKilgarriff21";
        s1.updateUserName(newUsername);
        assertEquals(s1.getUserName(), newUsername);
    }
}
