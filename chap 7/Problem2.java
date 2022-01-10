import java.util.Scanner;
public class Problem2 {
    static void pat(int n){
        for(int i=1; i<=n ;i++){
            for(int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void pa(int n){
        for(int i=n; i>=1; i--){
            for(int j =1; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num of lines>> ");
        int n = sc.nextInt();

        // pat(n);
        pa(n);
    }
}
