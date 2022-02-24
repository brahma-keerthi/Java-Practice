interface Animal{
    void eat();
    void sleep(); 
}
class Monkey implements Animal{
    Monkey(){
        System.out.println("This is a monkey.\nIt can jump and bite");
    }
    Monkey(int i){
        System.out.println("This is Human class which is inherited from Monkey");
    }
    void bite(){
        System.out.println("Monkey is bitiing");
    }
    void jump(){
        System.out.println("Monkey is jumping");
    }
    public void eat(){
        System.out.println("MOnkey is eating");
    }
    public void sleep(){
        System.out.println("MOnkey is sleeping");
    }
}


class Human extends Monkey{
    Human(){
        super(1);
    }
    public void eat(){
        System.out.println("Human is eating");
    }
    public void sleep(){
        System.out.println("Human is sleeping");
    }
    void fallInLove(){
        System.out.println("Human is falling in Love");
    }
}

public class MonHum {
    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.bite();
        m.jump();

        Human h = new Human();
        h.eat();
        h.sleep();

        // Polymorphism
        Monkey mn = new Human(); // only monkey members is accessible
        // If method overriding is present, then only the Human methods are accessed
        mn.eat(); // Human's eat method is accessed, as the eat() method is overrided
        mn.bite();
        // mn.fallInLove(); --> gives error
    }
}
