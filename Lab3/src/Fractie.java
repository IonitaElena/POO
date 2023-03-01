public class Fractie {
        int numarator, numitor;
        public Fractie(int numarator, int numitor){
            this.numarator=numarator;
            this.numitor=numitor;
        }
        public Fractie(){
            this(6,3);
        }
        public Fractie suma( Fractie f2){
        int numarator_final=this.numarator*f2.numitor+f2.numarator*this.numitor;
        int numitor_final=this.numitor*f2.numitor;
                return new Fractie(numarator_final,numitor_final);
        }
@Override
    public String toString() {
            return this.numarator + "/" + this.numitor;
        //return super.toString();
    }
    public boolean equals(Fractie f2){
            Fractie f1= new Fractie();
            if(f1.numarator==f2.numarator && f1.numitor==f2.numitor)
                return true;
            else
                return false;
    }
    public static void main(String[] args){
            Fractie Frac =new Fractie();
            Fractie f2= new Fractie(4,2);
            Frac.suma(f2);
            System.out.println(Frac.suma(f2));
        System.out.println(Frac.toString());
            System.out.println(f2.toString());
        System.out.println(Frac.equals(f2));
    }
}
