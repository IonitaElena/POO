package Laborator13.P1;

public class BasicIceCream implements IceCream{
    public String topping;
    double cost;
    public BasicIceCream(){
        topping="cone";
        cost=0.5;
        System.out.println("Adding cone");
    }
    public String getDescription(){
        return topping.toString();
    }
    public double getCost(){
        return cost;
    }
    public String getTopping(){
       return topping;
    }
    public void setTopping(String topping ){
        this.topping = topping;
    }
}
