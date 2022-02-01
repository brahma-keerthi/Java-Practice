import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the num of elements>> ");
        n = sc.nextInt();

        int [] a = new int[n];

        System.out.println("Enter the elemnts>> ");
        for(int i =0; i<n; i++)
            a[i]= sc.nextInt();

        int max = a[0];

        for(int i=0; i<n; i++){
            if(max<a[i])
                max= a[i];
        }

        System.out.println("The maximum is "+ max );
    }
}
