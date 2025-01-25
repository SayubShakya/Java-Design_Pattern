package abstractFactoryMethod.Main;

public class AsusManufacturer extends Company{

    @Override
    public Gpu crateGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
    
}
