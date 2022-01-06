import java.util.Scanner;

public class CBSEMarksExe {
    public static void main(String [] PersentageCalculator){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        float per = 0f;

        for(int i=0; i<5; i++){
            System.out.println("Enter the marks of Subject" + (i+1) + ": ");
            marks[i] = sc.nextInt();
            per = per + marks[i];
        }

        System.out.println("The PERCENTAGE of marks out of 100 is " + (per/5) + "%");
    }
}
