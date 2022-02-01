import java.util.Scanner;
public class Problem4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the required String>> ");
        String name = sc.nextLine();

        int count1 = 0, count2 = 0;
        for(int i =0; i<name.length(); i++){
            if(name.charAt(i) == ' ' && name.charAt(i+1) == ' ')
            count1++;

            if(name.charAt(i) == ' ' && name.charAt(i+1) == ' ' && name.charAt(i+2) == ' ')
            count2++;
        }
        count1 = count1 - 2*count2;

        System.out.println("Double spaces occurred " + count1 + "times");
        System.out.println("Triple spaces occurred " + count2 + "times");

        System.out.println("Dear Harry,\nThis java course is Nice\nThanks");
    }
}
