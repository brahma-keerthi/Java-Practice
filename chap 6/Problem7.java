import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the num of elements>> ");
        n = sc.nextInt();

        int [] a = new int[n];

        System.out.println("Enter the elemnts>> ");
        for(int i =0; i<n; i++)
            a[i]= sc.nextInt();

        int min = a[0];

        for(int i=0; i<n; i++){
            if(min>a[i])
                min= a[i];
        }

        System.out.println("The minimum is "+ min );
    }
}

