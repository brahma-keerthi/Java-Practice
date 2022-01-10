public class advancedSwitch {
    public static void main(String[] args) {
        int x = 7;  // x is int or char or string

        // switch (x){
        //     case 1:
        //         System.out.println(x);
        //         break;

        //     default:
        //         System.out.println(x);

        //     case 2:
        //         System.out.println(x);
        //         break;

            
        // }

        switch (x){
            case 1 -> System.out.println(x); // automatically adds break statement
            default -> System.out.println(x);
            case 2 -> System.out.println(x);
        }
    }
}
// if one of statements is executed then, all the cases after that statements will be executed util it encounters a break statement