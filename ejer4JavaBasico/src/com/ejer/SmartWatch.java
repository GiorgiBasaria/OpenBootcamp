package com.ejer;

public class SmartWatch extends SmartDevice{
    protected boolean pulspmetro;

    public SmartWatch(){

    }

    public SmartWatch(String fabricante, String modelo, int memoriaRAM, int memoriaInterna, String resolucionPantalla, String sistemaOperativo, boolean pulspmetro) {
        super(fabricante, modelo, memoriaRAM, memoriaInterna, resolucionPantalla, sistemaOperativo);
        this.pulspmetro = true;
    }

    public boolean getPulspmetro(){
        return pulspmetro;
    }

}
