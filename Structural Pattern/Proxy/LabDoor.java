package Proxy;

public class LabDoor implements Door {

    @Override
    public void open(String param) {
        System.out.println("Open Lab Door");
    }

    @Override
    public void close() {
        System.out.println("Clossing Lab Door");

    }

}
