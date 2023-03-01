package com.ejer3;

public class Ejer3 {
    public static void main(String[] args) {

        String[] ciudades = {"Madrid", " Valencia", " Barcelona", " Alicante", " Bilbao"};

        String todasCiudades = "";

        for(String ciudad : ciudades){
            todasCiudades += ciudad;
        }
        System.out.println("Todas Las ciudades: " + todasCiudades);

    }
}
