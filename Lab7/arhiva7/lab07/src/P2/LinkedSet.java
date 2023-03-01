package P2;

import java.util.Objects;
import java.util.Set;
import java.util.LinkedList;
public class LinkedSet extends LinkedList implements Set{
    public boolean add(Objects obj){
        if(this.contains(obj))
            return false;
        else
            return super.add(obj);
    }
    public void add(int i, Object obj){
        if(this.contains(obj))
            return;
        else
            super.add(i,obj);
    }
    public Object set(int i, Object obj){
        if(this.contains(obj))
            return false;
            else
                return super.set(i,obj);
    }
}
