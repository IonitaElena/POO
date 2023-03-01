package P1;

public class Book extends Product{

    public Book(float pret, String nume) {
        super(pret, nume);
    }

    public float getPriceReduced() {
        return getPret() - getPret()*15/100;
    }
}