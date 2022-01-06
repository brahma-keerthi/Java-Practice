import java.util.Scanner;

public class Question2 {
    public static void main(String[] CGPA){
        Scanner sc = new Scanner(System.in);
        int per = 0;
        int marks[] = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("Enter the marks of subject" + (i+1) +": ");
            marks[i] = sc.nextInt();
            per = per+marks[i];
        }

        float sum = per/3;
        System.out.println("CGPA = " + sum/9.5);
        
    }
}
