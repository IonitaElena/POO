package Laborator13.P1;

public abstract class ToppingDecorator implements IceCream{
    protected IceCream iceCream;

    public ToppingDecorator(IceCream iceCream) {
        this.iceCream=iceCream;
    }
    public String getDescription(){
        return iceCream.getDescription();
    }
    public double getCost(){
        return iceCream.getCost();
    }

}
