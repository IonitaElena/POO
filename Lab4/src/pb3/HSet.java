package pb3;
import java.util.*;
public class HSet {
    Hashtable htable;
    public HSet(){
        htable = new Hashtable();
    }
    //Adauga un element in multime, daca nu exista deja
    public boolean add(Object value) {
        if(htable.contains(value))
            return false;
        htable.put(value, value);
        return true;
    }
    //returneaza un String cu elementele multimii (doar cheile, nu perechi)
    public String toString() {
        String rez = new String();
        Enumeration chei = htable.keys();
        while(chei.hasMoreElements()){
            String cheie = (String)chei.nextElement();
            rez = rez + cheie + " " ;
        }
        return rez;
    }

    //Sterge perechea corespunzatoare cheii, intorcand valoarea
    public Object remove(Object key) {
        Object val = htable.get(key);
        htable.remove(key);
        return val;
    }
    public int size(){
        return htable.size();
    }
}
