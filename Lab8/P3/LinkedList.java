package lab08.P3;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private static class Node<T> {
        T value;
        Node <T> next;

        public Node(T value) {
            this.value = value;
            next = null;
        }

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    class ListIterator implements Iterator<T> {
        private Node<T> currentNode;

        public ListIterator(Node<T> node) {
            currentNode = node;
        }

        public boolean hasNext() {
            return (currentNode != null);
        }

        public T next() {
            T value = currentNode.value;
            currentNode = currentNode.next;
            return value;
        }
    }

    private Node<T> first;
    private Node<T> last;

    public T getNode() {
        return first.value;
    }

    public void addFirst(T data) {
        if(first == null) {
            first = new Node(data);
            return;
        }

        first = new Node(data, first);
    }

    public void add(T data) {
        if(first == null) {
            first = new Node(data);
            last = first;
            return;
        }

        last.next = new Node(data);
        last = last.next;
    }

    public Iterator<T> iterator() {
        return new ListIterator(first);
    }
}

