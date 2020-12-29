package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int value = (int) (2 + Math.random() * 3);
        String rate = null;
        switch (value) {
            case 2:
                rate = "'неудовлетворительно'";
                break;
            case 3:
                rate = "'удовлетворительно'";
                break;
            case 4:
                rate = "'хорошо'";
                break;
            case 5:
                rate = "'отлично'";
                break;
        }

        System.out.println("Преподаватель " + this.name + " оценил студента с именем " +
                student.getName() + " по предмету " + this.subject + " на оценку " + rate);
    }
}
