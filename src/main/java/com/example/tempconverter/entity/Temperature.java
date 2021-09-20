package com.example.tempconverter.entity;

public class Temperature {

    private String fromUnit, toUnit;
    private float data;

    public Temperature(String toUnit, String fromUnit, float data) {
        this.toUnit = toUnit;
        this.fromUnit = fromUnit;
        this.data = data;
    }

    public String getToUnit() {
        return toUnit;
    }

    public void setToUnit(String toUnit) {
        this.toUnit = toUnit;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(String fromUnit) {
        this.fromUnit = fromUnit;
    }

    public float getData() {
        return data;
    }

    public void setData(float data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "type_t='" + toUnit + '\'' +
                ", fromUnit='" + fromUnit + '\'' +
                ", data_t=" + data +
                '}';
    }
}
