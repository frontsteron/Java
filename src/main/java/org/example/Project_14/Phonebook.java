package org.example.Project_14;

import java.util.HashMap;
import java.util.Map;
public class Phonebook {

     // Реализуйте структуру телефонной книги с помощью HashMap учитывая, что 1 человек может иметь несколько телефонов.

    public static void main(String[] args) {
        Map<String, String> bookPhone = new HashMap<>();
        bookPhone.put("Александра", "12-34-56");
        bookPhone.put("Анатолий", "23-34-45");
        bookPhone.put("Всеволод", "34-56-67");
        bookPhone.put("Герасим", "98-76-55");
        bookPhone.put("Даниил", "87-78-65");
        bookPhone.put("Оксана", "65-77-75");
        bookPhone.put("Юсуп", "54-75-85");
        bookPhone.put("Яна", "32-74-95");

        System.out.println("Справочник: \n" + bookPhone);

        add(bookPhone, "Василий", "13-46-79");
        System.out.println("Добавили: \n" + bookPhone);

        remove(bookPhone, "Анатолий");
        System.out.println("Удалили: \n" + bookPhone);
    }
    public static void add(Map<String, String> note, String name, String num){
        note.put(name, num);
    }
    public static void remove(Map<String, String> note, String name){
        note.remove(name);
    }
}