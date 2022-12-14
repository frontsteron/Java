package org.example.Project_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class DelEvenNum {
    // Пусть дан произвольный список целых чисел, удалить из него четные числа
        public static void main(String[] args) {
            delEven();
        }
        private static void delEven() {
            List<Integer> array = new ArrayList<>();
            for (int i = 0; i < 30; i++) {
                Random random = new Random();
                int val = random.nextInt(20);
                array.add(val);
            }
            System.out.println(array);
            for (int i = 0; i < array.size();) {
                if(array.get(i) % 2 == 0) {
                    array.remove(i);
                } else {
                    i++;
                }
            }
            System.out.print(array);
        }
    }