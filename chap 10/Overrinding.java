// Method overriding is having same method in parent and child classes

class Base{
    void call(){
        System.out.println("Method called from Base");
    }
}

class Derived extends Base{
    @Override   // Used to represent overRiding of functions
    void call(){
        System.out.println("method called from derived");
    }
}

public class Overrinding {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived();

        b.call();
        d.call();
    }
}
