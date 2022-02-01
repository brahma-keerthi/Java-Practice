import java.util.Scanner;

class Rectangle{
    Rectangle(int s){
        System.out.println("Area is " + (s*s) + " sq. units");
    }

    Rectangle(int s, int t){
        System.out.println("Area is " + (s*t) + " sq. units");
    }
}

public class Rec {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3);
        Rectangle rec2 = new Rectangle(4, 5);
    }
}
