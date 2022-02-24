interface Kitchen{
    void items();
    boolean hasWashBasin();
}

interface LivingRoom{
    void itemsLR();
    boolean hasTV();
}

class House implements Kitchen, LivingRoom{
    public void items(){
        System.out.println("It has all the utensils");
    }

    public boolean hasWashBasin(){
        System.out.println("It has wash Basin");
        return true;
    }

    public void itemsLR(){
        System.out.println("It has all the items of living room");
    }

    public boolean hasTV(){
        System.out.println("It does not have TV");
        return false;
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // House h = new House();
        // h.items();
        // boolean a = h.hasWashBasin();
        // h.itemsLR();
        // boolean b = h.hasTV();

        Kitchen k = new House(); // Dynamic method Dispatch
        k.items();
        boolean c = k.hasWashBasin();

        // Here only kitchen methods are only accessible
    }
}
