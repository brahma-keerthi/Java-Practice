// Implements the inheritance of the interfaces
interface version1{
    void moveUp();
    void moveDown();
}

interface version2 extends version1{
    void moveUp();
    void moveDown();
    void fire();
    void drive();
}

class PUB_G implements version2{
    public void moveUp(){  // all the inherited methods should also be redefined
        System.out.println("Press Up arrow to move up");
    }

    public void moveDown(){
        System.out.println("Press Down arrow to move down");
    }

    public void fire(){
        System.out.println("Press return to fire");
    }

    public void drive(){
        System.out.println("Press shift to get into vehicle");
    }
}

public class Phone {
    public static void main(String[] args) {
        PUB_G pg = new PUB_G();
        pg.moveDown();
        pg.moveUp();
        pg.fire();
        pg.drive();
    }
}
