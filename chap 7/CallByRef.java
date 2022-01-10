public class CallByRef {
    static void change(int a[]){
        a[0] = 100;
    }
    public static void main(String[] args) {
        int[] arr = {1,6,669,54};

        change(arr);
        System.out.println("The changed value of element at index 1>> " + arr[0]);
    }
}
//When the array is passed to the function , array is object . So the array name will be passed is an object. Hence when the object is passed to function, this behaves as similar to the call by reference