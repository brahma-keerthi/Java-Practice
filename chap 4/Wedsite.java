import java.util.Scanner;
public class Wedsite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the website>> ");
        String name = sc.nextLine();

        if(name.endsWith(".com"))
        System.out.println("Commercial Website");

        else if(name.endsWith(".org"))
        System.out.println("Organisational Website");

        else if(name.endsWith(".in"))
        System.out.println("Indian Website");
    }
}
