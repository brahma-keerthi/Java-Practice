import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of lines>>");
        int a = sc.nextInt();

        for(int i=a; i>0; i--){
            for(int j = i; j>0; j--)
            System.out.print("*");

        System.out.print("\n");
        }
    }
}
