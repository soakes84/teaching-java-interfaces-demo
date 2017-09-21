package com.theironyard;

public class Main {

    public static void main(String[] args) {

        // Adding adds the two numbers together
        Calculator adder = new Adding( 12, 7 );
        System.out.println( adder.process() );

        // Multiplying multiplies the two numbers together
        Calculator mult = new Multiplying( 13, 15 );
        System.out.println( mult.process() );

        // Subtracting SHOULD subtract the two numbers
        Calculator sub = new Subtracting( 7, 2 );
        System.out.println( sub.process() );
    }
}
