import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dob;
    private long id;
    int numStudents = 0;
    private String userName;
    private final ArrayList<Course> courses = new ArrayList<>();
    private final ArrayList<Module> modules = new ArrayList<>();

    //Constructor
    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = LocalDate.parse(dob, dtf);
        numStudents++;
        this.id = numStudents;
        this.userName = setUserName();
    }

    // Create username from combination of student name and age
    public String setUserName() {
        return name + age;
    }

    // Add course
    public void setCourses(Course course) {
        if (this.courses.contains(course)) {
            System.out.println("Already Enrolled");
        } else {
            this.courses.add(course);
            // Add mandatory course modules
            this.modules.addAll(course.getListOfModules());

        }
    }

    // Add selected modules
    public void setModules(Module module) {

        if (this.modules.contains(module)) {
            System.out.println("Already Listed");
        } else {
            this.modules.add(module);
        }
    }

    // Unregister Student from course - Updating lists
    public void removeCourse(Course course) {
        if (!this.courses.contains(course)) {
            System.out.println("Not Enrolled");
        } else {
            this.courses.remove(course);
            // Add mandatory course modules
            this.modules.removeAll(course.getListOfModules());

        }
    }

    // Removes module from students list and from modules list
    public void removeModule(Module module) {

        if (!this.modules.contains(module)) {
            System.out.println("Not Listed");
        } else {
            this.modules.remove(module);
        }
    }

    // Accessors
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public long getId() {
        return id;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void updateUserName(String userName) {
        this.userName = userName;
    }


}
