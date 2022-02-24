abstract class PowerOff{
    abstract void Off(String name);
}

class nokia extends PowerOff{
    @Override
    void Off(String name){
        System.out.println("Long press of Red Button");
    }
}

class iPhone extends PowerOff{
    @Override
    void Off(String name){
        System.out.println("Long press of Side Button");
    }
}

public class PhoneOff {
    public static void main(String[] args) {
        PowerOff p = new nokia();  // Dynamic method dispatch is possible
        // nokia n = new nokia();
        iPhone i = new iPhone();
        // n.Off("Nokia");
        p.Off("Nokia");
        i.Off("IPhone");
    }
}
