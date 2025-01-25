package Decorater;

public class ExtraCheese extends BurgerDecorater{

    private Burger burger;

    public ExtraCheese(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
            return  burger.getDescription() + " With extra cheese";
    }

    @Override
    public double getCost() {
            return burger.getCost()+ 10.0;
    }
    
}
