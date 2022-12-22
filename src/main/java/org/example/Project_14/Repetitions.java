package org.example.Project_14;

import java.util.*;

public class Repetitions {
    public static void main(String[] args) {

        List<String> listOfEmployees = new ArrayList<>();

        addEmployeeNames(listOfEmployees, new String[] {
                "Александра", "Александра", "Кристина", "Александра",
                "Анатолий", "Анатолий", "Анатолий", "Всеволод",
                "Герасим", "Герасим", "Кристина", "Анна",
                "Всеволод", "Анна", "Кристина", "Марина",
                "Яна", "Яна","Марина","Юсуп"
        });

        System.out.println(howManyNames(listOfEmployees));
    }
    static TreeMap<String, Integer> howManyNames(List<String> names) {
        HashMap<String, Integer> result = new HashMap<>();
        for (String name : names) {
            if (result.containsKey(name)) {
                result.replace(name, result.get(name) + 1);
            } else {
                result.put(name, 1);
            }
        }
        TreeMap<String, Integer> sorted = new TreeMap<>(result);
        return sorted;
    }
    static void addEmployeeNames(List<String> listOfEmployees, String[] newEmployeeNames) {
        Collections.addAll(listOfEmployees, newEmployeeNames);
    }
}