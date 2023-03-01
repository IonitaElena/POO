public class MyQueue {
    MyArray v;
    private int Infinit = 9500;
    private int primul;
    private int ultimul;
    private int n;

    public MyQueue() {
        Infinit = 0;
        primul = 0;
        ultimul = 0;
        v = new MyArray();
    }

    public int getSize() {
        //return v.getSize();
        return n;
    }

    public void enqueue(int valoare) {
        v.set(ultimul, valoare);
        ultimul++;
        n++;
        return;
    }

    public int dequeue() {
        primul++;
        n--;
        return v.get(primul - 1);
    }

    public boolean isEmpty() {
        if (n == 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = primul; i < ultimul; i++) {
            s += v.get(i);
            s += " ";
        }
     return s;
    }
}

class MyArray {
    private int v[];
    private int size;
    public MyArray() {
        this(100);
    }
    public MyArray(int length) {
        size = 0;
        v = new int[length];
    }
    public int get(int poz) {
        if(poz < size) {
            return v[poz];
        } else {
            return -1;
        }
    }
    public void set(int pos, int value) {
        v[pos] = value;
        size++;
    }
    public int getSize() {
        return size;
    }
}
class Test {
    public static void main(String args[]) {
        MyQueue queue = new MyQueue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(-1);
        queue.enqueue(2);
        System.out.println(queue);
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue);
        queue.enqueue(9);
        queue.enqueue(queue.dequeue());
        queue.enqueue(11);
        queue.enqueue(22);
        System.out.println(queue);
        while(!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println("");
        System.out.println(queue);
    }
}