package LIFO;

public class Node<T> {
    private T content;
    private Node next = null;

    public Node(T content){
        this.content = content;
    }

    public void setContent(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
}
