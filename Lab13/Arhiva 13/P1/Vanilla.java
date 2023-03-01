package Laborator13.P1;

public class Vanilla extends ToppingDecorator {
    public Vanilla(IceCream iceCream){
        super(iceCream);
        System.out.println("Adding vanilla\n");
    }
    public String getDescription(){
        return iceCream.getDescription() + ", vanilla, ";
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 2;
    }
}
