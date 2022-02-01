public class Problem5 {
    public static void main(String[] args) {
        int [] i = {1,2,3,4,5,6,7};

        for(int a =0, b= i.length-1; a<=b; a++, b--){
            int temp = i[a];
            i[a]=i[b];
            i[b] = temp;
        }

        for(int a: i){
            System.out.println(a);
        }
    }
}
