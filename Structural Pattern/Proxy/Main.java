package Proxy;

public class Main {
    public static void main(String[] args) {
        Door door = new SecuredDoor(new LabDoor());
        door.open("ijajc");

        door.open("sayub");
        door.close();
    }
}


