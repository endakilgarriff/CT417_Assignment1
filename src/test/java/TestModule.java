import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestModule {

    Student s1 = new Student("Enda Kilgarriff", 21, "05/01/1999");
    Student s2 = new Student("Eoghan Muldoon", 22, "06/07/1998");


    Module m1 = new Module("Digital Signal Processing", "EE445");
    Module m2 = new Module("System On Chip 1", "EE401");
    Module m3 = new Module("Statistics", "MA101");
    Module m4 = new Module("Software Engineering 3", "CT417");

    Course c1 = new Course("Electronic and Computer Engineering", "BP", "28/08/2020", "31/05/2021");

    @Before
    @Description("Setup Class")
    public void initialize() {
        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m4);
    }

    @Test
    @Description("Register Student for Module")
    public void testAddStudent() {
        m3.addStudents(s1);
        ArrayList<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(s1);
        assert (m3.studentsRegistered().equals(expectedStudents));
    }

    @Test
    @Description("Unregister Student from module")
    public void testRemoveStudent() {
        m3.addStudents(s1);
        m3.addStudents(s2);

        ArrayList<Student> expectedStudents = new ArrayList<>();
        expectedStudents.add(s1);
        expectedStudents.add(s2);

        assert (m3.studentsRegistered().equals(expectedStudents));

        m3.removeStudent(s1);
        expectedStudents.remove(s1);
        assert (m3.studentsRegistered().equals(expectedStudents));
    }

    @Test
    @Description("Get Associated courses")
    public void testGetCourses() {
        ArrayList<Course> expectedCourse = new ArrayList<>();
        expectedCourse.add(c1);
        assert (m4.getAssociatedCourses().equals(expectedCourse));
    }

    @Test
    @Description("Get module Name")
    public void testGetModuleName() {
        assertEquals(m2.getName(), "System On Chip 1");
    }

}
