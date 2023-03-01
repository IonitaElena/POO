import java.util.*;
public class Prob4 {
    public static void main(String[] args) {
        Prob4 object = new Prob4();
        Vector a = new Vector(10);
        Vector b = new Vector(10);
        a.add(1);
        a.add(3);
        a.add(7);
        b.add(1);
        b.add(2);
        b.add(9);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        Vector inters = object.intersectie(a, b);
        Vector reun = object.reuniune(a, b);
        Vector dif = object.diferenta(a, b);
        System.out.println("Intersectie: " + inters);
        System.out.println("Reuniune: " + reun);
        System.out.println("Diferenta: " + dif);


    }
    public Vector intersectie(Vector a, Vector b){
        Vector rez = new Vector(10);
        for(int i = 0; i < a.size(); i++)
            for(int j = 0; j < b.size(); j++)
                if(a.get(i) == b.get(j))
                    rez.add(a.get(i));
        return rez;
    }

    public Vector reuniune(Vector a, Vector b){
        Vector rez = new Vector(20);
        for(int i = 0; i < a.size(); i++) {
            if(rez.contains(a.get(i)) == false)
                rez.add(a.get(i));
            if(i < b.size() && rez.contains(b.get(i)) == false)
                rez.add(b.get(i));
        }
        for(int i = a.size(); i < b.size(); i++)
            if(rez.contains(b.get(i)) == false)
                rez.add(b.get(i));
        return rez;
    }

    public Vector diferenta(Vector a, Vector b){
        Vector rez = new Vector(10);
        for(int i = 0; i < a.size(); i++)
            if(b.contains(a.get(i)) == false)
                rez.add(a.get(i));
        for(int i = 0; i < b.size(); i++)
            if(a.contains(b.get(i)) == false)
                rez.add(b.get(i));
        return rez;
    }
}