import java.util.*;
public class Prob3 {
    public static void main(String[] args) {
        Random generator = new Random();
        Vector v = new Vector(20);
        for (int i = 0; i < 20; i++) {
            v.add(generator.nextInt(10));
        }
        System.out.println(v);
        Prob3 obiect = new Prob3();
        obiect.remove(v, 4);
        System.out.println(v);
        System.out.println("Max este: " + Collections.max(v));
        int min = (int) Collections.min(v);
        System.out.println("Poz min este: " + v.indexOf(min));
        float ma = 0;
        for(int i = 0; i < v.size(); i++)
            ma += (int)v.get(i);
        ma /= v.size();
        System.out.println("Media aritmetica: " + ma);
    }
    public void remove(Vector v, int x){
        for(int i = 0; i < v.size(); i++)
            if((int)v.get(i) == x)
                v.remove(i);
        return;
    }
}



