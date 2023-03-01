package P1;

public class Beverage extends Product{

    public Beverage(float pret, String nume) {
        super(pret, nume);
    }

    @Override
    public float getPriceReduced() {
        return getPret() - getPret()*5/100;
    }
}