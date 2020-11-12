import jdk.jfr.Description;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCourse {
    Student s1 = new Student("Enda Kilgarriff", 21, "05/01/1999");
    Student s2 = new Student("Eoghan Muldoon", 22, "06/07/1998");
    Student s3 = new Student("Rebecca Black", 24, "25/02/1996");

    Module m1 = new Module("Digital Signal Processing", "EE445");
    Module m2 = new Module("System On Chip 1", "EE401");
    Module m3 = new Module("Statistics", "MA101");
    Module m4 = new Module("Software Engineering 3", "CT417");

    Course c1 = new Course("Electronic and Computer Engineering", "BP", "28/08/2020", "31/05/2021");

    @Test
    @Description("Add default course modules")
    public void testAddCourseModules() {
        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m4);

        ArrayList<Module> expectedModules = new ArrayList<Module>();
        expectedModules.add(m1);
        expectedModules.add(m2);
        expectedModules.add(m4);

        assert (c1.getListOfModules().equals(expectedModules));
    }

    @Test
    @Description("Enroll Students")
    public void testEnrollStudent() {
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        String[] expectedNames = {"Enda Kilgarriff", "Eoghan Muldoon"};
        for (int i = 0; i < c1.getStudentsRegistered().size(); i++) {
            assertEquals(c1.getStudentsRegistered().get(i).getName(), expectedNames[i]);
        }

    }

    @Test
    @Description("Remove student from Course")
    public void testRemoveStudent() {
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c1.enrollStudent(s3);
        c1.removeStudent(s2);

        String[] expectedStudentNames = {s1.getName(), s3.getName()};
        for (int i = 0; i < c1.getStudentsRegistered().size(); i++) {
            assertEquals(c1.getStudentsRegistered().get(i).getName(), expectedStudentNames[i]);
        }
    }

    @Test
    @Description("Remove a course module")
    public void testRemoveModule() {
        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m3);
        c1.addModuleToCourse(m4);

        c1.removeModuleFromCourse(m3);
        ArrayList<Module> expectedModules = new ArrayList<Module>();
        expectedModules.add(m1);
        expectedModules.add(m2);
        expectedModules.add(m4);

        assert (c1.getListOfModules().equals(expectedModules));
    }

    @Test
    @Description("Get Course Start Date")
    public void testGetStartDate() {

        LocalDate startDate = LocalDate.parse("28/08/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        assertEquals(c1.getStartDate(), startDate);
    }

    @Test
    @Description("Change course end date")
    public void testChangeDate() {
        LocalDate newEndDate = LocalDate.of(2021, 05, 30);
        c1.setEndDate(newEndDate);
        assertEquals(c1.getEndDate(), newEndDate);
    }
}
