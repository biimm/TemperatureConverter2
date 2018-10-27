package com.example.biim.temperatureconverter.Model;
public class Body {
    private int number;
    public Body(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public double tranformF_to_C(){
        return (number-32)/1.8;
    }
    public int tranformC_to_F(){
        return (int)((number*1.8)+32);
    }
}
