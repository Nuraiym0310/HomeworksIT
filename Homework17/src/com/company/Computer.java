package com.company;

import java.util.Arrays;

public class Computer {
    private Display display;
    private String brand;
    private String color;
    private SSD ssd;
    private RAM ram;
    private String videoCard;
    private USB [] array;
    private Keyboard keyboard;

    public Computer() {
    }

    public Computer(Display display, String brand, String color, SSD ssd, RAM ram,
                    String videoCard, USB[] usb, Keyboard keyboard) {
        this.display = display;
        this.brand = brand;
        this.color = color;
        this.ssd = ssd;
        this.ram = ram;
        this.videoCard = videoCard;
        this.array = usb;
        this.keyboard = keyboard;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public USB[] getUsb() {
        return array;
    }

    public void setUsb(USB[] usb) {
        this.array = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

}
