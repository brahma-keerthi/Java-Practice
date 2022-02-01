import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] a = {{1, 2, 3}, {45,2,1}};
        int [][] b = {{5,3,7}, {7,6,8}};

        System.out.println("The sum of a and b is");
        for(int[] i: a){
            for(int j: i)
                System.out.print(j+" ");
            System.out.println();
        }

        for(int[] i: b){
            for(int j: i)
                System.out.print(j+" ");
            System.out.println();
        }

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                a[i][j]= a[i][j]+b[i][j];
            }
        }

        System.out.println("The sum is>> ");
        for(int [] i: a){
            for(int j: i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
