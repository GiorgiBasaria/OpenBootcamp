package com.ejercicios;

public class DividePoCero {

    public static void divideByZero() throws ArithmeticException {
        int a = 1 / 0;
    }

    public static void main(String[] args) {

        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

    }

    
}
