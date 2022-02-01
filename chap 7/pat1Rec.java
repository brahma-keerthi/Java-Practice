import java.util.Scanner;
public class pat1Rec {
    // public static void pat(int n){
    //     if(n>0){
    //     pat(n-1);
    //     for(int i =0; i<n; i++){
    //         System.out.print("*");
    //     }
    //     System.out.println();}

    //     else 
    //     return;
    // }

    public static void pat(int n){
        if(n>0){
        
        for(int i =0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
        pat(n-1);
        }

        else 
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the num of lines>> ");
        int n = sc.nextInt();

        pat(n);
    }
}
