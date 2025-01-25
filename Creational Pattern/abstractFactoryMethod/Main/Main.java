package abstractFactoryMethod.Main;

public class Main{
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        Gpu maGpu = msi.crateGpu();
        Monitor msMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        Gpu asusGpu = msi.crateGpu();
        Monitor asusMonitor = msi.createMonitor();


        
    }
}


