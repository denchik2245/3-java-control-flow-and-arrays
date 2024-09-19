package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Если массив пустой или равен null, ничего не делаем
            return;
        }

        // Инициализируем минимальное значение и индекс минимального элемента
        int minValue = arr[0];
        int minIndex = 0;

        // Ищем индекс минимального элемента (последнее вхождение)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            } else if (arr[i] == minValue) {
                // Обновляем индекс на последний минимальный элемент
                minIndex = i;
            }
        }

        // Меняем местами первый элемент и минимальный элемент
        int temp = arr[0];
        arr[0] = arr[minIndex];
        arr[minIndex] = temp;
    }


}