package com.example.task13;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (arr == null) {
            return null; // Возвращаем null, если входной массив равен null
        }

        // Шаг 1: Подсчитываем количество элементов ≤ 1000
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                count++;
            }
        }

        // Шаг 2: Создаем новый массив нужного размера
        int[] result = new int[count];

        // Шаг 3: Копируем подходящие элементы в новый массив
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1000) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }
}