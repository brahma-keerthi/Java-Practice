interface Tyre{
    int a = 200; // Interface members are public, final and abstract
    // Hence the members can't be altered
    void setTyre(String t);
    // a = 34; gives error 
}

interface Colour{
    void setColour(String c);
}

interface VehicleType{
    void setType(String t);
}

// Multiple INderitance using Interface
class Vehicle implements Tyre, Colour, VehicleType{
    public int a = 34;  // This value of a will get the highest priority 
    @Override
    public void setType(String t){
        System.out.println("The given is of type >> " + t);
    }

    @Override
    public void setColour(String c) {
        System.out.println("The colour of vehicle is >> " + c);
        
    }

    @Override
    public void setTyre(String t) {
        System.out.println("The type of tyres is :>> " + t);
        
    }
}

public class MultipleInheritance {
    public static void main(String []args){
        Vehicle v  = new Vehicle();
        v.setType("Car");
        v.setColour("Red");
        v.setTyre("MRF");
    }
}
