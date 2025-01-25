package Command;

//client
public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();

        Command trunOn = new TrunOn(bulb);
        Command trunOff = new TrunOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(trunOn);
        remoteControl.submit(trunOff);
    }
}


