import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String dob;
    private long id ;
    int numStudents = 0;
    private String userName;
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<Module> modules = new ArrayList<Module>();

    //Constructor
    public Student(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        numStudents++;
        this.id = numStudents;
        this.userName = getUserName();
    }

    private String getUserName(){
        return name + Integer.toString(age);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
