public class Problem6 {
    static float ave(int ...arr){
        int av =0, i =0;
        for(int a : arr){
            av = av + a;
            i++;
        }
        return av/i;
    }
    public static void main(String[] args) {
        System.out.println("THe average is " + ave(2,5,8,3));
    }
}
