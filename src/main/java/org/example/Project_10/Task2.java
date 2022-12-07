//Вывести все простые числа от 1 до 1000

package org.example.Project_10;

public class Task2 {
    public static void main(String [] args) {

        for(int i = 2; i <= 1000; i++) {
            boolean primeNum = true;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primeNum = false;
                    break;
                }
            }

            if(primeNum) {
                System.out.println(i);
            }
        }
    }
}
