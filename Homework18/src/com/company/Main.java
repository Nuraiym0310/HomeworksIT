package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cow cows1 = new Cow("45", -2, "F", "Maya");
        Cow cows2 = new Cow("78", 2, "M", "Black");
        Cow cows3 = new Cow("87", 3, "F", "Meka");
        Cow cows4 = new Cow("30", 6, "M", "Kari");
        Cow cows5 = new Cow("90", 7, "M", "Berlin" );
//
//        cows2.setWeight("Weight - 90, ");
//        cows2.setAge(7);
//        cows2.setGender("Gender - M, ");
//        cows2.setName("Name - Berlin");


        Sheep sheep1 = new Sheep("32", 4, "F", "Coul");
        Sheep sheep2 = new Sheep("47", 5, "M", "Lin" );
        Sheep sheep3 = new Sheep("20", 1, "M", "Sem");


        Horse horse1 = new Horse("70", -3, "M", "Balto");
        Horse horse2 = new Horse("120", 3, "F", "Keri" );
//        horse2.setWeight("Weight - 120, ");
//        horse2.setAge(3);
//        horse2.setGender("Gender - F, ");
//        horse2.setName("Name -

        Farm firstFarm = new Farm();
        firstFarm.setAddress("The address is: Schwabah Strasse 17");
        Cow [] herd = {cows1, cows2, cows3, cows4, cows5};
        firstFarm.setHerd(herd);
        Sheep[] otara = {sheep1, sheep2, sheep3};
        firstFarm.setOtara(otara);
        Horse[] tabun ={horse1, horse2};
        firstFarm.setTabun(tabun);
        firstFarm.setFarmOwner("Farm owner  is: Jannis Rou");

        System.out.println("___________________________________________________");
        System.out.println("Information about first farm: ");
        System.out.println();
        System.out.println(firstFarm.getAddress());
        System.out.println();
        System.out.println(firstFarm.getFarmOwner());
        System.out.println();
        System.out.println("In farm: "+ herd.length + " cows |       " + otara.length +" sheep |       " + tabun.length + " horses |  ");
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println(Arrays.toString(firstFarm.getHerd()));
        System.out.println(Arrays.toString(firstFarm.getOtara()));
        System.out.println(Arrays.toString(firstFarm.getTabun()));


        Cow cow2 = new Cow("55", 3, "F", "Korovushka");
        Sheep sheeps2 = new Sheep("78", 9, "M", "Baran");
        Horse horses2 = new Horse("190", 12, "M", "Lieber");

        Farm secondFarm = new Farm();
        secondFarm.setAddress("The address is: Rosen Strasse 99");
        Cow[] herd2 ={cow2};
        secondFarm.setHerd(herd2);
        Sheep[] otara2 = {sheeps2};
        secondFarm.setOtara(otara2);
        Horse[] tabun2 = {horses2};
        secondFarm.setTabun(tabun2);
        secondFarm.setFarmOwner("Farm owner is: Martin Killian");

        System.out.println("_________________________________________________________________________________________________________________________________________________________________________");
        System.out.println();
        System.out.println();
        System.out.println("________________________________________________________");
        System.out.println("Information about second farm: ");
        System.out.println();
        System.out.println(secondFarm.getAddress());
        System.out.println();
        System.out.println(secondFarm.getFarmOwner());
        System.out.println();
        System.out.println("In farm: "+ herd2.length + " cows |       " + otara2.length +" sheep |       " + tabun2.length + " horses |  ");
        System.out.println("________________________________________________________");
        System.out.println(Arrays.toString(secondFarm.getHerd()));
        System.out.println(Arrays.toString(secondFarm.getOtara()));
        System.out.println(Arrays.toString(secondFarm.getTabun()));

    }
}
