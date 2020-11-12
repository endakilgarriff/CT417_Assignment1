import java.util.ArrayList;

public class Module {

    private String name;
    private ArrayList<Student> studentsRegistered;
    private Course course;

    public Module(String name, ArrayList<Student> studentsRegistered, Course course) {
        this.name = name;
        this.studentsRegistered = studentsRegistered;
        this.course = course;
    }

    public void addStudents(Student student){
        studentsRegistered.add(student);
    }

    public void removeStudent(Student student) {
        studentsRegistered.remove(student);
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
