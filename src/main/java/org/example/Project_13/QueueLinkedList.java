package org.example.Project_13;

import java.util.LinkedList;
public class QueueLinkedList {

    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди, dequeue() - возвращает
    // первый элемент из очереди и удаляет его, first() -
    // возвращает первый элемент из очереди, не удаляя.

    public static void main(String[] args) {

        int[] list = { 1, 9, 2, 8, 3, 7 };

        LinkedList<Integer> llist = new LinkedList<>();
        for (Integer temp : list) {
            llist.add(temp);
        }
        System.out.println("Очередь - " + llist);

        enqueue(llist, 44);
        System.out.println("Поместил элемент " + 44 + " в конец очереди - " + llist);

        System.out.print("Возвратил(показал) первый(этот) элемент из очереди и удалил его - " + dequeue(llist) + " ");
        System.out.println(llist);

        System.out.print("Возвратил(показал) первый(этот) элемент из очереди, не удаляя его - "  + first(llist) + " ");
        System.out.println(llist);
    }
    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }
    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }
    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}