import java.util.Arrays;
import java.util.Random;

public class SortComparison {

    // Пузырьковая сортировка (O(n^2))
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Меняем элементы местами
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Быстрая сортировка (O(n log n) в среднем случае)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void main(String[] args) {
        // Тестируем на массивах разного размера
        int[] smallArray = generateRandomArray(100);
        int[] mediumArray = generateRandomArray(10_000);
        int[] largeArray = generateRandomArray(100_000);

        System.out.println("Сравнение скорости сортировки:");
        System.out.println("--------------------------------");

        // Маленький массив
        compareSorts(smallArray.clone(), "Маленький массив (100 элементов)");

        // Средний массив
        compareSorts(mediumArray.clone(), "Средний массив (10,000 элементов)");

        // Большой массив
        compareSorts(largeArray.clone(), "Большой массив (100,000 элементов)");
    }

    private static void compareSorts(int[] arr, String testName) {
        System.out.println("\n" + testName);

        // Пузырьковая сортировка
        int[] bubbleArray = arr.clone();
        long startTime = System.nanoTime();
        bubbleSort(bubbleArray);
        long bubbleTime = System.nanoTime() - startTime;

        // Быстрая сортировка
        int[] quickArray = arr.clone();
        startTime = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length-1);
        long quickTime = System.nanoTime() - startTime;

        // Вывод результатов
        System.out.printf("Пузырьковая сортировка: %,d нс\n", bubbleTime);
        System.out.printf("Быстрая сортировка: %,d нс\n", quickTime);
        System.out.printf("Разница: в %.1f раз(а) быстрее\n\n", 
                         (double)bubbleTime/quickTime);
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size * 10);
        }
        return arr;
    }
}
