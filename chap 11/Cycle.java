class Cyc{
    Cyc(){
        System.out.println("Cycle was invented in 1890s");
    }

    void pedal(){
        System.out.println("Increasing Speed...");
    }

    void brake(){
        System.out.println("Decreasing Speed...");
    }
}

interface Pedal{
    void pedal();
    default void tapLegs(){   /// By using default, can define method here itself
        System.out.println("Tap your legs on the pedal to pedal");
    }
}

interface Brake{
    void brake();
}

interface Gears{
    void gearUp();
    void gearDown();
}

class FireFox extends Cyc implements Pedal, Brake, Gears{
    public void pedal(){
        System.out.println("Making a sound to increase speed");
        super.pedal();
    }

    public void brake(){
        System.out.println("Red lights on to depict braking");
        super.brake();
    }

    public void gearUp(){
        System.out.println("Increasing the gears to pick up speed");
    }

    public void gearDown(){
        System.out.println("Decreasing the gears to stop the vehicle");
    }
}

public class Cycle {
    public static void main(String[] args) {
        FireFox f = new FireFox();
        f.pedal();
        f.gearUp();
        f.brake();
        f.gearDown();
    }
}
