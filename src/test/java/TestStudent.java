import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestStudent {
    private String name = "Enda Kilgarriff";
    private String dob = "01/05/1999";
    private int age = 21;
    Student s1 = new Student(name, age, dob);

    @Test
    public void testStudentCreation(){
        assertEquals(name, s1.getName());
    }

    @Test
    public void testGetUsername(){
        assertEquals(s1.getUserName(), "Enda Kilgarriff21");
    }

}
