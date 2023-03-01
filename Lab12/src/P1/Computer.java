package P1;

public class Computer extends Product{

    public Computer(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced() {
        return getPret() - getPret()*10/100;
    }
}