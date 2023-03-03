package com.ejer;

public class SmartPhone extends SmartDevice{
    protected int resolucionCamara;

    public SmartPhone() {

    }

    public SmartPhone(String fabricante, String modelo, int memoriaRAM, int memoriaInterna, String resolucionPantalla, String sistemaOperativo, int resolucionCamara) {
        super(fabricante, modelo, memoriaRAM, memoriaInterna, resolucionPantalla, sistemaOperativo);
        this.resolucionCamara = resolucionCamara;
    }

    public int getResolucionCamara(){
        return resolucionCamara;
    }



}
