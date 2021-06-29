package com.company;

public class Main {

    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        parrot.setName("Гора");
        parrot.setType("Ара");
        parrot.setAge(3);
        parrot.setMaxDuration("25");

        dog.setName("Хатико");
        dog.setType("Хаски");
        dog.setAge(-10);
        dog.setMaxDuration("30");

        cat.setName("Пом-пом");
        cat.setType("Египетская кошка");
        cat.setAge(-4);
        cat.setMaxDuration("10");

        fish.setName("Немо");
        fish.setType("Дельфин");
        fish.setAge(2);
        fish.setMaxDuration("40");
        System.out.println("___________________________________________________________________");
        System.out.println("Name of animals | " + "Type   " + "                | Age   " + "    | Max Duration ");
        System.out.println("___________________________________________________________________");
        System.out.println(parrot.getName() + "            | " + parrot.getType() + "                    | " + parrot.getAge() + "         | " + parrot.getMaxDuration());
        System.out.println(dog.getName() + "          | " + dog.getType() +  "                  | " + dog.getAge() + "         | "+ dog.getMaxDuration());
        System.out.println(cat.getName() + "         | " + cat.getType() +  "       | " + cat.getAge() + "         | "+ cat.getMaxDuration());
        System.out.println(fish.getName() + "            | " + fish.getType() +  "                | " + fish.getAge() + "         | "+ fish.getMaxDuration());


    }
}
