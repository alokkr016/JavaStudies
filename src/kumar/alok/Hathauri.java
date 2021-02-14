package kumar.alok;

public class Hathauri {
    public double x,y,r;
    public Hathauri bigger(Hathauri c){
        if(c.r > r)
            return  c;
        else
            return this;

    }
    public static Hathauri bigger(Hathauri a, Hathauri b){
        if(a.r > b.r)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Hathauri a = new Hathauri(2.0);
        Hathauri b = new Hathauri(3.0);
        Hathauri c = a.bigger(b);
        Hathauri d = Hathauri.bigger(a,b);
    }
}
