package kumar.alok;

// This is the main class Question
public class Question213{
    // 'print()' method is defined in class Question
    void print(Question213 object){
        System.out.print("Well Done!");
    }

    void studentMethod(){
        print(this);
    }



    public static void main(String[] args) {
        // Object of the main class is created
        Question213 q = new Question213();
        // Print method on object of Question class is called
        q.studentMethod();
    }



}