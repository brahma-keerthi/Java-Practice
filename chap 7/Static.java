public class Static {
    // static int add(int x, int y){
    //     return x+y;
    // }

    int add(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        int a = 2, b=8;
        Static obj = new Static();
        int c = obj.add(a,b );

        // int c = add(a, b);
        System.out.println(c);
    }
}

//here only a static main function can call a static method
// when non static is present then the object has to created to call the non-static function