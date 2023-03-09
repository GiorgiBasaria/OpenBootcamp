package com.ninterfsce;

public class Coche {

    // Atributos
    String modelo;
    int cvs;
    double velocidadMaxima;
    boolean hibrido;

    // Constructor

    public Coche(){

    }

    public Coche(String marca, int cvs, double velocidadMaxima, boolean hibrido){
        this.modelo = marca;
        this.cvs = cvs;
        this.velocidadMaxima = velocidadMaxima;
        this.hibrido = hibrido;
    }

    // Methods


    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", cvs=" + cvs +
                ", velocidadMaxima=" + velocidadMaxima +
                ", hibrido=" + hibrido +
                "\n" +
                '}';
    }
}
