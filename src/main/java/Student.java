import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.*;

public class Student {

    private String name;
    private int age;
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dob;
    private long id;
    int numStudents = 0;
    private String userName;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    //Constructor
    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = LocalDate.parse(dob,dtf);
        numStudents++;
        this.id = numStudents;
        this.userName = setUserName();
    }

    // Create username from combination of student name and age
    public String setUserName() { return name + Integer.toString(age); }

    // Accessors
    public String getName() {
        return name;
    }

    public int getAge() { return age; }

    public LocalDate getDob() { return dob; }

    public long getId() { return id; }

    public int getNumStudents() { return numStudents; }

    public String getUserName() { return userName; }

    public ArrayList<Course> getCourses() { return courses; }

    public ArrayList<Module> getModules() { return modules; }

    // Mutators
    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void setDob(LocalDate dob) { this.dob = dob; }

    public void setId(long id) { this.id = id; }

    public void setNumStudents(int numStudents) { this.numStudents = numStudents; }

    public void updateUserName(String userName) { this.userName = userName; }

    public void setCourses(ArrayList<Course> courses) { this.courses = courses; }

    public void setModules(ArrayList<Module> modules) { this.modules = modules; }

}


