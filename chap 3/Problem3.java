import java.util.Scanner;

public class Problem3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String name = "Dear <!name!> , Thanks a lot";
        System.out.println("Enter the name of Person>> ");
        String replace = sc.nextLine();

        System.out.println(name.replace("<!name!>", replace));
    }
}