import java.util.Arrays;

public class SimpleSet<E> {
    private Object[] elements;
    private int size;
    
    public SimpleSet() {
        elements = new Object[10];
        size = 0;
    }
    
    public boolean add(E element) {
        if (contains(element)) {
            return false;
        }
        
        if (size == elements.length) {
            increaseCapacity();
        }
        
        elements[size++] = element;
        return true;
    }
    
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                elements[i] = elements[size - 1];
                elements[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return size;
    }
    
    private void increaseCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
    
    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }
    
    public static void main(String[] args) {
        SimpleSet<String> set = new SimpleSet<>();
        
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Не добавится
        
        System.out.println(set); // [Apple, Banana]
        System.out.println("Contains Banana: " + set.contains("Banana")); // true
        
        set.remove("Apple");
        System.out.println(set); // [Banana]
    }
}
