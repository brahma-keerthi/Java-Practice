import java.util.Scanner;

class square{
    private int x;
    square(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length>> ");
        x = sc.nextInt();
    }
    
    void perimeter(){
        System.out.println("The perimeter is "+ 4*x + " units");
    }

    void area(){
        System.out.println("The area is " + x*x +" sq. units");
    }
}
public class prob3{
    public static void main(String[] args) {
        square s = new square();
        s.perimeter();
        s.area();
    }
}