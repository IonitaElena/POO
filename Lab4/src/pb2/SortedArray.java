package pb2;

public class SortedArray extends Array{
    public void addElement(Integer x) {
        int i;
        for (i = 0; i < getSize(); i++)
            if (x < get(i)) {
                super.addElement(x, i);
                break;
            }
        if(i == getSize())
            super.addElement(x, i);
    }
}
