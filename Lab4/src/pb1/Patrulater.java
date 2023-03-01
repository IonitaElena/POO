package pb1;

import java.lang.Math;
class Patrulater {
    public int latura1, latura2, latura3, latura4;
    public double unghi1, unghi2, unghi3, unghi4;

    public Patrulater() {
        this(0, 0, 0, 0);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.latura4 = latura4;
    }

    public Patrulater(double unghi1, double unghi2, double unghi3, double unghi4) {
        this(0, 0, 0, 0, unghi1, unghi2, unghi3, unghi4);
    }

    public Patrulater(int latura1, int latura2, int latura3, int latura4,
                      double unghi1, double unghi2, double unghi3, double unghi4) {
        this(latura1, latura2, latura3, latura4);
        this.unghi1 = unghi1;
        this.unghi2 = unghi2;
        this.unghi3 = unghi3;
        this.unghi4 = unghi4;
    }

    public int perimetru() {
        int result;
        result = latura1 + latura2 + latura3 + latura4;
        return result;
    }
    public static void main(String[] args) {
        Paralelogram paralelogram = new Paralelogram(5, 6,Math.PI/4,Math.PI/3);
        Romb romb =new Romb(7,Math.PI / 2 ,10,5);
        Dreptunghi dreptunghi=new Dreptunghi(5,10);
        Patrat patrat = new Patrat(5);
        System.out.println( "Aria paralelogramului: " + paralelogram.Arie(paralelogram.latura1, paralelogram.latura2, paralelogram.unghi1));
        System.out.println( "Aria romb: " + romb.Arie(romb.diag1, romb.diag2,romb.unghi1));
        System.out.println( "Aria dreptunghi: " + dreptunghi.Arie(dreptunghi.latura1, dreptunghi.latura2));
        System.out.println( "Aria ppatrat: " + patrat.Arie(patrat.latura1));
    }
}
class Paralelogram extends Patrulater {
    public Paralelogram(int lungime, int latime, double unghi1, double unghi2) {
        super(lungime, latime, lungime, latime, unghi1, Math.PI -unghi1, unghi1, Math.PI -unghi1);
    }
    public double Arie(int lungime,int latime, double unghi1){
        return lungime * latime * Math.sin(unghi1);
    }
}

class Romb extends Paralelogram {
    public Romb(int latura, double unghi,int diag1, int diag2){
        super(latura,latura,unghi,unghi);
        this.diag1=diag1;
        this.diag2=diag2;
    }
    int diag1,diag2;
    public double Arie ( int diag1 , int diag2,  double unghi) {
        return (diag1 + diag2) / 2;
    }

}
class Dreptunghi extends Paralelogram {
    public Dreptunghi(int lungime, int latime){
        super(lungime,latime, Math.PI /2 , Math.PI/2);
    }
    public int Arie(int lungime, int latime){
        return latura1*latura2;
    }
}

class Patrat extends Dreptunghi {
    public Patrat(int latura) {
        super(latura, latura);
    }

    public double Arie(int latura) {
        return latura1 * latura1;

    }
}


