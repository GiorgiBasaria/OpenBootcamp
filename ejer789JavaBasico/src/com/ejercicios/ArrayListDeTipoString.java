package com.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListDeTipoString {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("España", "Alemania", "Ucrania", "Mujasransk"));
        LinkedList<String> linkedList = new LinkedList<>(arrayList);

        for(String i : arrayList) {
            System.out.println(i);
        }

        for(String i : linkedList) {
            System.out.println(i);
        }

    }
}
