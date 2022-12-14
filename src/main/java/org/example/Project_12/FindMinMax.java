package org.example.Project_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FindMinMax {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void main(String[] args) {
        findMinMaxAve();
    }
    private static void findMinMaxAve() {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int val = random.nextInt(20);
            array.add(val);
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array.get(0) + " - this is the minimum number");
        System.out.println(array.get(array.size()-1) + " - this is the maximum number");
        System.out.println(array.get(array.size()/2) + " - this is the average number");
    }
}
