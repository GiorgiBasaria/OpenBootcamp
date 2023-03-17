package com.ejercicios;

public class CadenaAlReves {

    public static void main(String[] args) {
        String s = "hola mundo";
        System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
