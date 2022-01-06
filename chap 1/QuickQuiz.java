import java.util.Scanner;

public class QuickQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the three numbers whose sum has to calculated: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("The sum of the given numbers is " + sum);

    }

}
