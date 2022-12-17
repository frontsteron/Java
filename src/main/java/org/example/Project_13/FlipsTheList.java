package org.example.Project_13;

import java.util.LinkedList;
public class FlipsTheList {

     // Пусть дан LinkedList с несколькими элементами.
     // Реализуйте метод, который вернет “перевернутый” список.

    public static void main(String[] args) {
        int[] listMas = new int[9];// Задаем случайный массив
        for (int i = 0; i < listMas.length; i++) {
            listMas[i] = ((int)(Math.random() * 50) - 25);
            System.out.print(listMas[i] + " ");
        };
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer temp : listMas) {
            linkList.add(temp);
        }

        int temp = 0;
        while (temp != linkList.size() - 1) {
            linkList.add(linkList.size()-temp, linkList.getFirst());
            linkList.removeFirst();
            temp++;
        }
        System.out.println(" - наш список");
        System.out.print(linkList + " - певорачиваем его");
    }
}
