import jdk.jfr.Description;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class TestStudent {
    private final String name = "Enda Kilgarriff";
    private final String dob = "01/05/1999";
    private final int age = 21;
    private final String course1 = "Electronic and Computer Engineering";
    private final String courseCode1 = "BP";
    Student s1 = new Student(name, age, dob);

    // Test course
    Course c1 = new Course(course1, courseCode1, "28/08/2020", "31/05/2021");

    //Modules
    Module m1 = new Module("Digital Signal Processing", "EE445");
    Module m2 = new Module("System On Chip 1", "EE401");
    Module m3 = new Module("Statistics", "MA101");
    Module m4 = new Module("Software Engineering 3", "CT417");

    @Before
    @Description("Setup")
    public void initialize() {
        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m4);

        c1.enrollStudent(s1);
    }

    @Test
    @Description("Test Get name")
    public void testStudentCreation() {
        assertEquals(name, s1.getName());
    }

    @Test
    @Description("Test get Username")
    public void testGetUsername() {
        assertEquals(s1.getUserName(), "Enda Kilgarriff21");
    }

    @Test
    @Description("Test Get DOB")
    public void testGetDob() {
        LocalDate testDob = LocalDate.of(1999, 5, 1);
        assertEquals(s1.getDob(), testDob);
    }

    @Test
    @Description("Test get ID")
    public void testGetID() {
        // Only one student created. S1 ID must be 1
        assertEquals(s1.getId(), 1);
    }

    @Test
    @Description("Test Updating Username")
    public void testUpdateUserName() {
        String newUsername = "EndaKilgarriff21";
        s1.updateUserName(newUsername);
        assertEquals(s1.getUserName(), newUsername);
    }

    @Test
    @Description("Student correctly enrolled in course")
    public void testGetCourse() {
        assertEquals(s1.getCourses().get(0).getCourseID(), c1.getCourseID());
    }

    @Test
    @Description("Students Module list matches with course")
    public void testGetModules() {
        String[] expectedModules = {"EE445", "EE401", "CT417"};
        for (int i = 0; i < s1.getModules().size(); i++) {
            assertEquals(s1.getModules().get(i).getModuleID(), expectedModules[i]);
        }
    }

    @Test
    @Description("Student can add extra modules")
    public void testSetModule() {
        s1.setModules(m3);
        String[] expectedModules = {"EE445", "EE401", "CT417", "MA101"};
        for (int i = 0; i < s1.getModules().size(); i++) {
            assertEquals(s1.getModules().get(i).getModuleID(), expectedModules[i]);
        }

    }

    @Test
    @Description("Unregister student from Module")
    public void testRemoveModules() {
        String[] expectedModules = {"EE445", "EE401", "CT417"};
        s1.setModules(m3);
        s1.removeModule(m3);
        for (int i = 0; i < s1.getModules().size(); i++) {
            assertEquals(s1.getModules().get(i).getModuleID(), expectedModules[i]);
        }
    }

    @Test
    @Description("Remove student from Course")
    public void testRemoveCourse() {
        s1.removeCourse(c1);
        assert (s1.getCourses().isEmpty());
    }


}
