package com.theironyard;

/**
 * Created by spenceroakes on 9/21/17.
 */
public class Multiplying implements Calculator {

    double operand1;
    double operand2;

    public Multiplying( double operand1, double operand2 ){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }
    public double process(){
        return operand1 * operand2;
    }
}
