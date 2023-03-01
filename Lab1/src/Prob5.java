public class Prob5 {
    public int putere(int n, int p){
        if (p == 0)
            return 1;
        else
            return putere(n,p-1)*n;

    }
    public static void main(String args[]){
        Prob5 prob5 = new Prob5();
        System.out.println(prob5.putere(2,4)+" " + Math.pow(2,4));

    }
}
