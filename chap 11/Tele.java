abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartPhone extends TelePhone{
    public void ring(){
        System.out.println("Phone is ringing...Pick the call");
    }
    public void lift(){
        System.out.println("Picked the call and answering to the call....");
    }
    public void disconnect(){
        System.out.println("Disconnected the phone after answering to it...");
    }
    void playGame(){
        System.out.println("Playing the video game...");
    }
}

public class Tele {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.ring();
        sp.lift();
        sp.disconnect();

        // POLYMORPHISM
        TelePhone t = new SmartPhone(); // SmartPhone acting as telephone hence only the telephone members are only accessible....
        // t.playGame();  --> Gives error
        t.disconnect(); //--> Polymorphism
    }
}
