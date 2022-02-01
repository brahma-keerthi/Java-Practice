public class Recursion {
    static int fac(int a){
        if(a==1||a==0)
            return 1;
        
        return a *fac(a-1);
    }

    static int fib(int n){
        if(n<=1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println("5th term in fibonacci series is "+ fib(5));
    }
}
