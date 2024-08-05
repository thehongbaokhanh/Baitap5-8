package People_Student_Employee;

public abstract class People {
    public String name;
    public int age;
    public boolean gender;

    public People(String name, int age, boolean gender) {
    }

    public abstract String eat();
    public abstract String sleep();
    public abstract String study();
}
