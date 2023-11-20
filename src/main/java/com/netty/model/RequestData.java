package com.netty.model;

public class RequestData {
    private int intValue;
    private String stringValue;

    public RequestData(){}

    public RequestData(int value, String stringValue) {
        this.intValue = value;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int value) {
        this.intValue = value;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
