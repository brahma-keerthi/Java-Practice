// Here the constructor of the base class is executed when the constructor of the child class is called

class Base{
    Base(){
        System.out.println("Constructor of Base");
    }
    Base(int i){
        System.out.println("Constructor with i = " + i);
    }
    Base(int i, int j){
        System.out.println("Constructor with i, j  = " + i + ", " + j);
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Constructor of Child");
    }
    Derived(int a){
        super(a, 23); // Super calls the consturctor of Parent class
        System.out.println("Constructor of child i = " + a);
    }
}
public class Constructor {
    public static void main(String []args){
        // Derived d = new Derived();
        Derived d = new Derived(21);
    }
}
