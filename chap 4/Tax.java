import java.util.Scanner;

public class Tax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Income of the employee>> ");
        double tax = sc.nextInt();

        if(tax <= 2.5)
        System.out.println("No tax has to be paid");

        else if(tax<=5)
        System.out.printf("%f has to be paid as tax", tax * 5/100);

        else if(tax <= 10)
        System.out.printf("%f has to be paid as tax", tax * 20/100);

        else if(tax>10)
        System.out.printf("%f has to paid as tax", tax * 30/100);
    }
}