package HEHE;

import java.util.EmptyStackException;

public class MyQueue<T> {
    private Node head = null;
    private Node tail = null;
    private int count = 0;

    public MyQueue(){
    }

    public void Enqueue(Node node){
        if (count != 0) {
            tail.setNext(node);
            tail = node;
            }
        else {
            head = node;
            tail = node;
            }
        count++;
    }

    public T Dequeue(){
        if (count == 0) {
            throw new EmptyStackException();
        }
        T res = (T) head.getContent();
        head = head.getNext();
        count--;
        return (T) res;
    }

    public T Peek(){
        if (count == 0) {
            throw new EmptyStackException();
        }
        return (T) head.getContent();
    }

    public int getCount() {
        return count;
    }
}
