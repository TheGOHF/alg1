import HEHE.Node;
import HEHE.Stack;

public class MainStack {
    public static void main(String[] args) {
        Stack myStack = new Stack<>();
        for (int i = 1; i <= 5; i++){
            myStack.Push(new Node(i)); // Добавляем элементы от 1 до 5
        }
        System.out.println(myStack.Peek()); // Смотрим верхушку стека
        System.out.println("");

        for (int i = 0; i < 5; i++){
            System.out.println(myStack.Pop() + " " + myStack.getCount()); // Удаляем элементы стрека, возвращая их,
        }                                                                 // через пробел печатая количество оставшихся
                                                                          // элементов в стеке

        System.out.println(myStack.Pop()); // пытаемся достать из пустого стека элемент, получаем ошибку

    }
}