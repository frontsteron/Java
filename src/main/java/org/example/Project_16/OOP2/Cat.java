package org.example.Project_16.OOP2;

public final class Cat {
    private final String name;
    private final int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sayHi() {
        System.out.printf("Кошку звать %s и ей %d лет", this.name, this.age);
    }

}