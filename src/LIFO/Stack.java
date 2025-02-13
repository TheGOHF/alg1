package LIFO;

import java.util.EmptyStackException;

public class Stack<T> {
    private Node top = null;
    private int count = 0;

    public Stack(){

    }
    public void Push(Node node){
        if (count != 0) {
            node.setNext(top);
        }
        top = node;
        count++;
    }

    public T Pop(){
        if (count == 0) {
            throw new EmptyStackException();
        }
        T res = (T) top.getContent();
        top = top.getNext();
        count--;

        return (T) res;
    }

    public T Peek(){
        if (count == 0) {
            throw new EmptyStackException();
        }
        return (T) top.getContent();
    }

    public int getCount() {
        return count;
    }
}
