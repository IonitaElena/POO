package Laborator13.P1;

public class Chocolate extends ToppingDecorator{
    public Chocolate(IceCream iceCream){
        super(iceCream);
        System.out.println("Adding choco");
    }
    public String getDescription(){
        return "Ingrediente: chocolate, "+ iceCream.getDescription();
    }
    public double getCost(){
        return 1.5 +iceCream.getCost();
    }
}
