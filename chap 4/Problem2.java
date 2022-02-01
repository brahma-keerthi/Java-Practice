import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, a, b, c ;
        float sum = 0;

        System.out.println("Enter marks of sub1>> ");
        a = sc.nextInt();

        System.out.println("Enter the marks of sub2>> ");
        b = sc.nextInt();

        System.out.println("Enter the marks of sub3>> ");
        c = sc.nextInt();

        if(a <33 || b<33 || c  < 33){
            System.out.println("Fail!!!");
            System.exit(0);
        }

        sum = (a+b+c)/3;

        if(sum<40){
            System.out.println("Fail!!!");
            System.exit(0);
        }
        System.out.println("Pass!!!");
    }
}
