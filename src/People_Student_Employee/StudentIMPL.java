package People_Student_Employee;

public class StudentIMPL extends People implements Student {

    public StudentIMPL(String name, int age, Boolean gender) {
        super(name, age, gender);
    }

    @Override
    public String registerCourse( String courseName) {
        return "Register course: " + courseName;
    }

    @Override
    public String registerCourse() {
        return "";
    }

    @Override
    public String attendClass() {
        return "Attend class";
    }

    @Override
    public String study() {
        return "Study";
    }

    @Override
    public String eat() {
        return "Eat";
    }

    @Override
    public String sleep() {
        return "Sleep";
    }
}