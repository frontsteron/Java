package org.example.Project_15;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        laptops.add(new Laptop("ASUS ExpertBook", 256, "Windows 11 Домашняя"));

        laptops.add(new Laptop("Lenovo IdeaPad", 128, "Windows 10 Профессиональная"));

        laptops.add(new Laptop("Acer Extensa", 1024, "Без ОС"));

        laptops.add(new Laptop("HUAWEI MateBook", 512, "Windows 11 Домашняя"));

        System.out.println("Первый критерий");
        Map<Object, Set<Laptop>> filteredLaptops = Laptop.filterByProperty(laptops);
        print(filteredLaptops);

        System.out.println("Второй критерий");
        Map<Object, Set<Laptop>> filteredLaptops2 = Laptop.filterByMinValue(laptops);
        print(filteredLaptops2);
    }
    private static void print(Map<Object, Set<Laptop>> map) {
        for (Map.Entry<Object, Set<Laptop>> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println();
        }
    }
}