package com.company;

import java.util.Arrays;

public class Farm {
    private  String address;
    private Cow[] herd;
    private Sheep[] otara;
    private Horse[] tabun;
    private String farmOwner;

    public Farm() {
    }

    public Farm(String address, Cow[] herd, Sheep[] otara, Horse[] tabun, String farmOwner) {
        this.address = address;
        this.herd = herd;
        this.otara = otara;
        this.tabun = tabun;
        this.farmOwner = farmOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getHerd() {
        return herd;
    }

    public void setHerd(Cow[] herd) {
        this.herd = herd;
    }

    public Sheep[] getOtara() {
        return otara;
    }

    public void setOtara(Sheep[] otara) {
        this.otara = otara;
    }

    public Horse[] getTabun() {
        return tabun;
    }

    public void setTabun(Horse[] tabun) {
        this.tabun = tabun;
    }

    public String getFarmOwner() {
        return farmOwner;
    }

    public void setFarmOwner(String farmOwner) {
        this.farmOwner = farmOwner;
    }
}