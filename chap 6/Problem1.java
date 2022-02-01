import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float [] f = new float[5];
        float sum = 0;

        System.out.println("Enter the elements>> ");
        for(int i=0; i<f.length; i++){
            f[i]= sc.nextFloat();
            sum = sum + f[i];
        }

        System.out.println("The given array contains>> ");
        for (float g : f) {
            System.out.println(g);
        }
        System.out.println("The sum of elements is "+ sum);
    }
}
