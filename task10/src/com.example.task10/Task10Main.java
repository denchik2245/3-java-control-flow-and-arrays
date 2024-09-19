package com.example.task10;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
         */
    }

    static int numMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int minValue = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            } else if (arr[i] == minValue) {
                minIndex = i; // Обновляем индекс на последний найденный минимальный элемент
            }
        }
        return minIndex;
    }

}