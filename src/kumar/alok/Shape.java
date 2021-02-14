package kumar.alok;

import java.util.Scanner;
class Shape{
    double length, breadth;
    Shape(double l, double b){ //Constructor to initialize a Shape object
        length = l;
        breadth= b;
    }
    Shape(double len){    //Constructor to initialize another Shape object
        length = breadth = len;
    }
    double calculate(){// To calculate the area of a shape object
        return length * breadth ;
    }
}
public class Test1 extends Shape{
    double height;
    Test1(double length,double h){
    super(length);
    height = h;
    }

    Test1(double length,double breadth,double h){
        super(length,breadth);
        height = h;
    }
    double calculate(){
        return length*breadth*height;
    }
}
