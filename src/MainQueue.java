import HEHE.MyQueue;
import HEHE.Node;
import HEHE.Stack;

import java.lang.invoke.MutableCallSite;

public class MainQueue {
    public static void main(String[] args) {
        MyQueue Q = new MyQueue<>();
        for (int i = 1; i <= 5; i++){
            Q.Enqueue(new Node(i)); // Добавляем элементы от 1 до 5
        }
        System.out.println(Q.Peek()); // Смотрим верхушку очереди
        System.out.println("");

        for (int i = 0; i < 5; i++){
            System.out.println(Q.Dequeue() + " " + Q.getCount()); // Удаляем элементы очереди, возвращая их,
        }                                                                 // через пробел печатая количество оставшихся
        // элементов в стеке

        System.out.println(Q.Dequeue()); // пытаемся достать из пустой очереди элемент, получаем ошибку

    }
}