package com.theironyard;

/**
 * Created by spenceroakes on 9/21/17.
 */
public class Adding implements Calculator {

    double first;
    double second;

    public Adding( double first, double second ){
        this.first = first;
        this.second = second;
    }
    public double process(){
        return first + second;
    }
}
