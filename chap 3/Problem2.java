import java.util.Scanner;
public class Problem2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word>> ");
        String name = sc.nextLine();

        System.out.println(name.replace(" ", "_" ));
    }
}
