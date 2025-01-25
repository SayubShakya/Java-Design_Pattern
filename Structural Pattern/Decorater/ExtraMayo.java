package Decorater;

public class ExtraMayo extends BurgerDecorater {
    
    private Burger burger;

    public ExtraMayo(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
            return burger.getDescription()  + " With extra mayo";
    }

    @Override
    public double getCost() {
            return burger.getCost() + 30.0;
    }
    
}
