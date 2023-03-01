public class Numar {
    int numar;

    public Numar(int numar){
        this.numar=numar;
    }

    public Numar(){
        this(1);
    }
    public int suma(int a){
        return a+numar;
    }
    public int suma(int a, int b){
        return suma(a)+b;
    }
    public int suma(int a, int b, int c){
        return suma(a+b)+c;
    }
    public int suma(int a, int b, int c, int d){
        return suma(a+b+c)+d;
    }

    public static void main(String[] args) {
        Numar nr= new Numar();
        System.out.println(nr.suma(5,2,1,0));
    }

}