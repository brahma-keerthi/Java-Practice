interface Car{  // All members are public and abstract
    void Brake(int decrement);
    void Acclerate(int increment);
}

class Mercedez implements Car{
    private int speed;
    Mercedez(int speed){
        this.speed = speed;
    }

    void getSpeed(){
        System.out.println("Current speed of Car is >> " + speed);
    }
    
    public void Brake(int d){ // Must be declared as publilc to access to public members of interface
        this.speed = this.speed - d;
        System.out.println("Speed after apply brakes>> " + speed);
    }

    public void Acclerate(int i){
        this.speed = this.speed + i;
        System.out.println("Speed after apply accelerate>> " + speed);
    }
}

public class Interface {
    public static void main(String[] args) {
        Mercedez m = new Mercedez(100);
        m.getSpeed();
        m.Acclerate(20);
        m.getSpeed();
        m.Brake(30);
        m.getSpeed();
    }
}
