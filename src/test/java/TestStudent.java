import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.time.*;
import java.util.Date;

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
        System.out.println(s1.getDob());
        //assertEquals(s1.getDob(), testDob);
    }
}
