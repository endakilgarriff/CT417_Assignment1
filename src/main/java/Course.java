import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;

public class Course {

    private String name;
    private ArrayList<Student> studentsRegistered;
    private ArrayList<Module> listOfModules;
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/yyyy");
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String name, ArrayList<Student> studentsRegistered, ArrayList<Module> listOfModules, String startDate,
        String endDate){
        this.name = name;
        this.studentsRegistered = studentsRegistered;
        this.listOfModules = listOfModules;
        this.startDate = (LocalDate) dtf.parse(startDate);
        this.endDate = (LocalDate) dtf.parse(endDate);

    }

    public void addStudentToCourse(Student student){
        studentsRegistered.add(student);
    }

    public void removeStudentFromCourse(Student student){
        studentsRegistered.remove(student);
    }

    public void addModuleToCourse(Module module){
        listOfModules.add(module);
    }

    public void removeModuleFromCourse(Module module){
        listOfModules.remove(module);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }
    public DateTimeFormatter getDtf() {
        return dtf;
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
