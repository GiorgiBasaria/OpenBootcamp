package com.ejer;

public class SmartDevice {
    protected String fabricante;
    protected String modelo;
    protected int memoriaRAM;
    protected int memoriaInterna;
    protected String resolucionPantalla;
    protected String sistemaOperativo;

    public SmartDevice(){
    }
    public SmartDevice(String fabricante, String modelo, int memoriaRAM, int memoriaInterna, String resolucionPantalla, String sistemaOperativo){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.memoriaInterna = memoriaInterna;
        this.resolucionPantalla = resolucionPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getFabricante(){
        return fabricante;
    }
    public String getModelo(){
        return modelo;
    }
    public int getMemoriaRAM(){
        return memoriaRAM;
    }
    public int getMemoriaInterna(){
        return memoriaInterna;
    }
    public String getResolucionPantalla(){
        return resolucionPantalla;
    }
    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

}

