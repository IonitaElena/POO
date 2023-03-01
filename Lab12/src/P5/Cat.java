package P5;

public class Cat implements Visitor {
    public void visit (Director f) {

        System.out.println("Nu poti folosi cat pe un director");
    }
    public void visit (Fisier f) {

        System.out.println(f.getName());

    }
}