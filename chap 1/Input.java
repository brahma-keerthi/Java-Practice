import java.util.Scanner;

public class Input {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);   // TO take input from the user the scanner class is used
                                              // first create a new object then use it

        // int a = sc.nextInt(); //Takes the input from the user
        // System.out.println(a);

        boolean b1 = sc.hasNextInt(); // Tells whether the input was a int or not returns a boolean
        System.out.println(b1);
                                              
        // String str = sc.nextLine(); // Takes the complete line as the input
        // System.out.println(str);
                                              
        // String st = sc.next(); //Takes only the first word as the input
        // System.out.println(st);

    }
    
}
