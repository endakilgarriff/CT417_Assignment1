import org.junit.*;
import static org.junit.Assert.assertEquals;


public class Testcases {

    @Test
    public void testStudentCreation(){
        String name = "Enda Kilgarriff";
        Student s1 = new Student(name, 21, "02/05/1999");
        assertEquals(name, s1.getName());
    }


}
