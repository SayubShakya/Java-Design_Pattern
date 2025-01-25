package factoryMethod;

public class Main{
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new  OperatingSystem();
        OS os = operatingSystem.getIntance("Open");
        os.app();
    }
}
