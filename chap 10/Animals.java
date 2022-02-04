class Animal{
    int legs;

    void action(){
        System.out.println("I am making sound!!!");
    }
}

class Dog extends Animal{
    void action(){
        System.out.println("I am barking!!!");
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal ani = new Animal();
        ani.legs = 6;
        System.out.println("Animal has >> " + ani.legs + " legs");
        ani.action();

        Dog dg = new Dog();
        dg.legs = 4;
        System.out.println("Dogs has >> " + dg.legs + " legs");
        dg.action();
    }
}
