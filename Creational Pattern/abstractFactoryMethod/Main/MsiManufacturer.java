package abstractFactoryMethod.Main;

public class MsiManufacturer extends Company{

    @Override
    public Gpu crateGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
    
}
