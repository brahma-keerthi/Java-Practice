abstract class Base{
    abstract void greet();
    void name(String name){
        System.out.println("Hi, " + name);
    }
}

class Anand extends Base{
    @Override
    void greet(){
        System.out.println("Good morning...");
    }
}

abstract class Boy extends Base{
    abstract int size(int n);
}

class abstractClass{
    public static void main(String[] args) {
        // Base b = new Base(); // Gives error as abstract class can't create objects
        Anand a = new Anand();
        a.greet();
        a.name("Anand");
    }
}