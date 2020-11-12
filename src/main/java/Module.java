import java.util.ArrayList;

public class Module {

    private String name;
    private ArrayList<Student> studentsRegistered;
    private ArrayList<Course> associatedCourses = new ArrayList<>();

    public Module(String name, ArrayList<Student> studentsRegistered) {
        this.name = name;
        this.studentsRegistered = studentsRegistered;
    }

    // Register Student for Module
    public void addStudents(Student student){
        if(studentsRegistered.contains(student)){
            System.out.println("Already Registered for : " + name);
        } else{
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

    public ArrayList<Student> studentsRegistered() {
        return studentsRegistered;
    }

    public void setStudents(ArrayList<Student> studentsRegistered) {
        this.studentsRegistered = studentsRegistered;
    }

    public ArrayList<Course> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }
}
