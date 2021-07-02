package com.company;

public class Main {

    public static void main(String[] args) {

        Display display = new Display();

        display.setDiagonal("Diagonal - 19, ");
        display.setManufacturer("Manufacturer - Germany, ");
        display.setMatrixType("Matrix type - TN+Film");

        SSD ssd = new SSD();
        ssd.setMemorySize("Memory size - 1000, ");
        ssd.setHowManyDisksAreDivided("Disks - 4");

        RAM ram = new RAM();
        ram.setVolume("Volume - 8 Гб, ");
        ram.setManufacturer("Manufacturer - America");



        USB usb1 = new USB();
        usb1.setPortID("The first usb ID is - A, ");
        usb1.setPortType("Type - C");

        USB usb2 = new USB();
        usb2.setPortType("Type - L");
        usb2.setPortID("The second usb ID is - B, ");

        USB[] array = {usb1, usb2};


        Keyboard keyboard = new Keyboard();
        keyboard.setSimvols('3');
        keyboard.setAdditionalNumbersOnTheRight(", Numbers on the right - Yes, there are, ");
        keyboard.setBacklightPresence("BacklightPresence - No, there isn't ");

        Computer computer = new Computer();

        computer.setBrand("Asus");
        computer.setColor("Black");
        computer.setDisplay(display);
        computer.setSsd(ssd);
        computer.setRam(ram);
        computer.setVideoCard("geForce");
        computer.setUsb(array);
        computer.setKeyboard(keyboard);


        System.out.println("__________________________________________________________________________________________________");
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Color: " + computer.getColor());
        System.out.println("Display: " + display.getDiagonal() + display.getManufacturer() + display.getManufacturer());
        System.out.println("SSD: " +  ssd.getMemorySize() + ssd.getHowManyDisksAreDivided() );
        System.out.println("RAM: " + ram.getVolume() + ram.getManufacturer());
        System.out.println("Video Card: " + computer.getVideoCard());
        System.out.println("USB ports: " + usb1.getPortID() + usb1.getPortType() + " | " + usb2.getPortID() + usb2.getPortType());
        System.out.println("Keyboard: " + "Simvols - " + keyboard.getSimvols() + keyboard.getAdditionalNumbersOnTheRight() + keyboard.getBacklightPresence());
        System.out.println("__________________________________________________________________________________________________");

    }


}
