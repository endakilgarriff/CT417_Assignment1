import java.util.ArrayList;

public class Module {

    private String name;
    private String moduleID;
    private final ArrayList<Student> studentsRegistered = new ArrayList<>();
    private final ArrayList<Course> associatedCourses = new ArrayList<>();

    //Constructor
    public Module(String name, String moduleID) {
        this.name = name;
        this.moduleID = moduleID;

    }

    // Register Student for Module
    public void addStudents(Student student) {
        if (studentsRegistered.contains(student)) {
            System.out.println("Already Registered for : " + name);
        } else {
            studentsRegistered.add(student);
            student.setModules(this);
        }
    }

    public void removeStudent(Student student) {
        studentsRegistered.remove(student);
        student.removeModule(this);
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> studentsRegistered() {
        return studentsRegistered;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(Course course) {
        associatedCourses.add(course);
    }
}
