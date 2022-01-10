import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the size of array>>");
        n = sc.nextInt();
        int [] arr = new int[n];

        System.out.println("Enter the elements of array>> ");
        for(int i=0; i<arr.length; i++)
            arr[i]= sc.nextInt();

        System.out.println("Enter the key element>> ");
        int key = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                System.out.println("The element is present at position "+(i+1));
                System.exit(0);
            }
        }

        System.out.println("The given element "+ key+ " is not present");
    }
}
