import java.util.Scanner;

public class Problem1{
    static void mul(int n){
        for(int i=1; i<11; i++)
            System.out.println(n + " * "+i+" = " + (n*i));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number>> ");
        int n = sc.nextInt();

        mul(n);
    }
}