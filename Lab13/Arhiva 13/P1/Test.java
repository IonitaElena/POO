package Laborator13.P1;

public class Test {
    public static void main(String[] args) {
        IceCream iceCream = new Vanilla(new Chocolate(new BasicIceCream()));
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getCost());

    }
}

