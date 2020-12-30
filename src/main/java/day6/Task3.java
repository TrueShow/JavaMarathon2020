package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Сергей Степанович", "математика");
        Student student1 = new Student("Петров");
        teacher1.evaluate(student1);
    }
}
