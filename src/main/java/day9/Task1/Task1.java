package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Valentine", "science");
        Teacher teacher = new Teacher("Ivan Sergeevich", "Chemistry");
        System.out.println(student.getGroup());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
