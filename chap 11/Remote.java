interface TVremote{
    void PressOn();
    void TurnOff();
    void ChangeVolume();
}

interface Smartromote extends TVremote{
    void changeChannel();
    void openSettings();
}

class iTv implements Smartromote{
    public void PressOn(){
        System.out.println("Tv is turning on...");
    }
    public void ChangeVolume(){
        System.out.println("Increase or decrease volume.....");
    }
    public void changeChannel(){
        System.out.println("Changing the channel...");
    }
    public void openSettings(){
        System.out.println("Settings is opended....");
    }
    public void TurnOff(){
        System.out.println("Turning off Tv");
    }
}

public class Remote {
    public static void main(String[] args) {
        iTv tv = new iTv();
        tv.PressOn();
        tv.ChangeVolume();
        tv.changeChannel();
        tv.openSettings();
        tv.TurnOff();
    }
}
