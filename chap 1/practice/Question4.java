import java.util.Scanner;

public class Question4 {
    public static void main(String[] KiloToMiles){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Distance is kilo meters: ");
        int a = sc.nextInt();

        System.out.println(a + "km = " + a*0.629 + "miles");
    }
}
