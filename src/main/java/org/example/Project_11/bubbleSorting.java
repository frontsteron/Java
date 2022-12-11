package org.example.Project_11;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.io.PrintWriter;

public class bubbleSorting {
    // Реализуйте алгоритм сортировки пузырьком числового
    // массива, результат после каждой итерации запишите в лог-файл.
    public static void main(String[] args) {
        int[] array = new int[12];// Задаем случайный массив
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 50) - 25);
            System.out.println(array[i]);
        };
        // Сортируем пузырьком
        int temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        try(PrintWriter out = new PrintWriter("bubbleSort.txt")) {
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Arrays.toString(array));
    }
}