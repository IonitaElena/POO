package P5;

public class Fisier extends Repository {
    public Fisier(String name) {
        super(name);
    }

    public void accept (Visitor f) {
        f.visit(this);

    }
}