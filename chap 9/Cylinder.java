import java.util.Scanner;

class Cyl{
    private int height;
    private int radius;

    Cyl(int h, int r){  // Declaration can't be done inside the constructor
        height = h;
        radius = r;
    }
    
    // void setDim(int height, int radius){
    //     this.height = height;
    //     this.radius = radius;
    // }
    
    void getDim(){
        System.out.println("The height is>> " + height + "\nThe radius is>> " + radius);
    }
    
    float volume(){
        return 3.14f*radius*radius*height;
    }
}
public class Cylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius>> ");
        int radius = sc.nextInt();
        System.out.println("Enter the height>> ");
        int height = sc.nextInt();

        Cyl cylinder = new Cyl(height, radius);
        // cylinder.setDim(height, radius);

        System.out.println("The volume is >> " + cylinder.volume());
    }
}