package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        int n = arr.length; // Размер массива

        // Проходим по всем элементам массива
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Индекс минимального элемента

            // Ищем минимальный элемент в оставшейся части массива
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Обновляем индекс минимального элемента
                }
            }

            // Меняем местами текущий элемент и минимальный найденный элемент
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}