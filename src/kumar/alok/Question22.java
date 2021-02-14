/*Complete the code segment to call the method  print() of class given class Printer to print the following.

--------------------------------
Hi! I am class STUDENT
Hi! I class SCHOOL.
--------------------------------*/


package kumar.alok;

// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}


  public class Question22 {
    public static void main(String[] args) {

        Printer m = new Printer();

        m.print("Hi! I am class STUDENT");
        m.print();
    }
}
