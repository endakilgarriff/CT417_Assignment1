import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;

public class Course {

    private String name;
    private String courseID;
    private ArrayList<Student> studentsRegistered = new ArrayList<>();
    private final ArrayList<Module> listOfModules = new ArrayList<>();
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate startDate;
    private LocalDate endDate;

    //Constructor
    public Course(String name, String courseID, String startDate, String endDate){
        this.name = name;
        this.courseID = this.courseID;
        this.startDate = LocalDate.parse(startDate,dtf);
        this.endDate = LocalDate.parse(endDate,dtf);
    }

    // Enrolls Student in course - updating lists
    public void enrollStudent(Student student){
        if(studentsRegistered.contains(student)) {
            System.out.println("Already Enrolled in Course: " + courseID);
        } else {
            studentsRegistered.add(student);
            student.setCourses(this);
        }
    }

    public void removeStudent(Student student){
        studentsRegistered.remove(student);
        student.removeCourse(this);
    }

    // Adds module to course
    public void addModuleToCourse(Module module){
        listOfModules.add(module);
        module.setAssociatedCourses(this);
    }

    public void removeModuleFromCourse(Module module){
        listOfModules.remove(module);
    }

    //Getters and Setters
    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public ArrayList<Student> getStudentsRegistered() {
        return studentsRegistered;
    }

    public void setStudentsRegistered(ArrayList<Student> studentsRegistered) {
        this.studentsRegistered = studentsRegistered;
    }
    public ArrayList<Module> getListOfModules() {
        return listOfModules;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
