package com.theironyard;

/**
 * Created by spenceroakes on 9/21/17.
 */
public class Subtracting implements Calculator {

    double num1;
    double num2;

    public Subtracting( double num1, double num2 ){
        this.num1 = num1;
        this.num2 = num2;
    }

     public double process(){
        return num1 - num2;
     }
}
