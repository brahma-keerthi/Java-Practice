import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float av=0;
        int n;
        System.out.println("Enter the num of students>> ");
        n = sc.nextInt();

        float [] f = new float[n];

        System.out.println("Enter the marks>> ");
        for(float i:f){
            i=sc.nextFloat();
            av = av+i;
        }
        av = av/n;

        System.out.println("The average marks is "+ av);

        
        
    }
}
