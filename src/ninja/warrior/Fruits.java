package ninja.warrior;

public class Fruits {
    String name,taste,size;
    Fruits(String n,String t,String s){
        name = n;
        taste = t;
        size = s;
    }
    void eat(){
        System.out.println(name+" "+taste);
    }
}
class Apple extends Fruits{
    Apple(String n, String t, String s){
        super(n, t, s);

    }
    @Override
    void eat(){
        System.out.println(name+" "+taste);
    }
}
class Orange extends Fruits{
    Orange(String n, String t, String s){
        super(n, t, s);
    }
    @Override
    void eat(){
        System.out.println(name+" "+taste);
    }
    public static void main(String[] args){
        Apple a = new Apple("Apple","Sweet","Heart");
        Orange o = new Orange("Orange","Sour","Round");
        a.eat();
        o.eat();
    }
}
