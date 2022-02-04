class Circle{
    int r;
    double a;

    Circle(int r){
        this.r = r;
        a =3.142 * r * r;  // Note to calculate area here
    }

    void area(){
        // a =3.142 * r * r;
        System.out.println("Area of Circle>> " + a);
    }

}

class Cylinder extends Circle{
    int h;
    double v;
    Cylinder(int r, int h){
        super(r);
        this.h = h;
        v = a * h;
    }
    
    void volume(){
        // System.out.println(a);
        System.out.println("Volume of Cylinder>> " + v);
    }
}

public class Circle_Cylinder {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        Cylinder cy = new Cylinder(3, 4);

        c.area();
        cy.volume();
    }
}
