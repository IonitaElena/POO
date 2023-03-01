import java.net.ProxySelector;

public class Magazin {
    String nume;
    Produs p1;
    Produs p2 ;
    Produs p3 ;

    public Magazin(String nume, Produs p1,Produs p2,Produs p3){
        this.nume=nume;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }
    public Magazin(){
        this("peni\n",new Produs("lapte",7,2), new Produs("ciocolata",5,10),
                new Produs("paste",1,15));
    }


    public String toString(){
        return p1.toString()+ "\n" + p2.toString() + "\n" + p3.toString();
    }
    public double getTotalProdus() {
        return this.p1.getTotalProdus()+this.p2.getTotalProdus()+this.p3.getTotalProdus();

    }
    public static void main(String[] args) {
        Magazin Magazin = new Magazin();
        System.out.println(Magazin.toString());
        System.out.println(Magazin.getTotalProdus());

    }
}
class Produs{
        String nume;
        double pret;
        int cantitate;

        public Produs(String nume, double pret, int cantitate) {
            this.nume = nume;
            this.pret = pret;
            this.cantitate = cantitate;

        }

    @Override
    public String toString() {

        return "Cumparaturi" + " "+ nume + " " + pret + " " + cantitate;
    }

    public double getTotalProdus(){

            return this.pret * this.cantitate;
    }




}
