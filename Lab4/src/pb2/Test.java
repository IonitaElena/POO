package pb2;

public class Test {
    public static void main(String[] args) {
        Array arr = new Array();
        arr.addElement(1);
        arr.addElement(5);
        arr.addElement(3);
        System.out.println("Size: " + arr.getSize());
        System.out.println("Array: " + arr);

        SortedArray sorted_arr = new SortedArray();
        sorted_arr.addElement(1);
        sorted_arr.addElement(5);
        sorted_arr.addElement(3);

        System.out.println("Size: " + sorted_arr.getSize());
        System.out.println("Sorted array: " + sorted_arr);

        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);
        System.out.println("pop: " + stack.pop());
        System.out.println(stack);



    }
}
