package pb2;

public class MyStack{
    Array arr;
    int first, last;
    public MyStack(){
        first = 0;
        last = 0;
        arr = new Array();
    }
    public void push(int x){
        arr.addElement(x, last);
        last++;
    }
    public int pop(){
        last--;
        int x = arr.get(last);
        arr.remove(last);
        return x;
    }

    @Override
    public String toString() {
        return "MyStack{" + "arr=" + arr + '}';
    }
}
