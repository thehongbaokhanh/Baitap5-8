package People_Student_Employee;

public class Test {
    public static void main(String[] args) {
        StudentIMPL student = new StudentIMPL("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
        student.study();
    }
}
