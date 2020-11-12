public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Enda Kilgarriff", 21, "05/01/1999");
        Student s2 = new Student("Eoghan Muldoon", 22, "06/07/1998");
        Student s3 = new Student("Rebecca Black", 24, "25/02/1996");

        Module m1 = new Module("Digital Signal Processing", "EE445");
        Module m2 = new Module("System On Chip 1", "EE401");
        Module m3 = new Module("Statistics", "MA101");
        Module m4 = new Module("Software Engineering 3", "CT417");

        Course c1 = new Course("Electronic and Computer Engineering", "BP", "28/08/2020", "31/05/2021");
        Course c2 = new Course("Computer Science", "CT", "28/08/2020", "31/05/2021");

        c1.addModuleToCourse(m1);
        c1.addModuleToCourse(m2);
        c1.addModuleToCourse(m4);
        c2.addModuleToCourse(m4);

        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        c2.enrollStudent(s3);

        m3.addStudents(s3);

        System.out.println("Students in " + c1.getCourseID() + " :\n");
        for(int i = 0; i< c1.getStudentsRegistered().size(); i++){
            System.out.println(c1.getStudentsRegistered().get(i).getName() + "\n");
        }

        System.out.println("Modules " + s3.getName() + " is registered for:\n");
        for(int i = 0; i< s3.getModules().size(); i++){
            System.out.println(s3.getModules().get(i).getModuleID() + "\n");
        }

    }
}
