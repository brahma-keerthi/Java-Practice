class Rectangle{
    int l, b, a;

    void set(int l, int b){
        this.l = l;
        this.b = b;
    }

    void area(){
        a = l*b;
        System.out.println("Area of Rectangle >> " + a);
    }
}

class Cuboid extends Rectangle{
    int h, v;
    void set(int l, int b, int h){
        super.set(l, b);  // super --> Methods of base
        this.h = h;       // super() --> Constructor of base
    }

    void volume(){
        // System.out.println(a);
        v = super.b * super.l * h;
        System.out.println("Volume of Cuboid >> " + v);
    }
}

public class Rectangle_Cuboid {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Cuboid c = new Cuboid();

        r.set(3, 5);
        c.set(3, 5, 2);

        r.area();
        c.volume();
    }
}
