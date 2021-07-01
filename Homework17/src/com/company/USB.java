package com.company;

public class USB {
    private String portType;
    private String portID;

    public USB() {
    }

    public USB(String portType, String portID) {
        this.portType = portType;
        this.portID = portID;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public String getPortID() {
        return portID;
    }

    public void setPortID(String portID) {
        this.portID = portID;
    }
}
