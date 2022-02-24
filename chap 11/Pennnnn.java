abstract class Pen{
    abstract void refill();
    abstract void write();
}

class FountainPen extends Pen{
    private String company ;
    FountainPen(String company){
        this.company = company;
    }
    void printCompany(){
        System.out.println("Fountain Pen's company is>> " + this.company);
    }
    void refill(){
        System.out.println("Refilling the ink");
    }
    void write(){
        System.out.println("Writing on the Paper");
    }
    void changeNib(){
        System.out.println("Change of Nib is successfull");
    }
}

public class Pennnnn {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen("Cello");
        fp.printCompany();
        fp.refill();
        fp.write();
        fp.changeNib();
    }
}