class cellPhone{
    void ring(){
        System.out.println("The Phone is ringing...");
    }
    void vibrate(){
        System.out.println("The Phone is vibrate...");
    }
}
public class pro2 {
    public static void main(String[] args) {
        cellPhone c = new cellPhone();
        c.ring();
        c.vibrate();
    }
}
