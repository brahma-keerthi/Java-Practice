import java.util.Scanner;

public class Problem3 {
    static int sum(int n){
        if(n==1)
            return n;

        return n + sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number>> ");
        int n = sc.nextInt();

        System.out.println("The sum is>> "+sum(n));
    }
}
