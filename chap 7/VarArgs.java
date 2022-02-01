public class VarArgs {
    static void add(int ...arr){ //This stores the entire parameters in the array...
        int sum =0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("The sum is>> "+sum);
    }
    public static void main(String[] args) {
        //insted of method overloading varargs method can be used...
        add(1,2,43);
        add(1,2,5,8,4);
        add(9,3);
    }
}
