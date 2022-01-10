import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of elements>> ");
        n = sc.nextInt();

        int [] a = new int[n];

        System.out.println("Entre the elements>> ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int flag =0;

        for(int i=0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j+1];
                    a[j+1] =  a[j];
                    a[j]= temp;
                    flag =1;
                }
            }
            if(flag==0){
                System.out.println("The array is already in sorted form");
                System.exit(0);
            }
        }

        System.out.println("The array is not in sorted form");
        System.out.println("But after sorting>> ");
        for(int i: a)
            System.out.print(i+" ");

    }   
}
