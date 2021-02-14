package kumar.alok;

class School {
    // This is a method in class School
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
}
// This is the class named Student
class Student {
    // This is a method in class Student
    public void print() {
        System.out.println("Hi! I am class STUDENT");
    }
}
public class Question212 {
    public static void main(String[] args) {
        School m = new School();
        Student p = new Student();

        p.print();
        m.print();
    }
}
