package kumar.alok;

class Circle {
    double x,y;
    double r;
    double area(){
        return Math.PI*r*r;
    }

    double circumference(){
        return 2*Math.PI*r;
    }

    Circle(double x,double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;

    }
    Circle(double r){
        this(0,0,r);
    }
    Circle(){
        x = 0; y = 0; r = 1;
    }
    Circle(Circle v) {
        x = v.x;
        y = v.y;
        r = v.r;
    }

}

class Main{
    public static void main(String[] args) {
        Circle m = new Circle(0,0,7);
        Circle p = new Circle(m);
        Circle s = new Circle();
        Circle n = new Circle(22);
        System.out.println("area of the circle is " + m.area());
        System.out.println("Circumference of the circle is " + m.circumference());
    }

}