package com.exampleOB;

public class SmartPhone extends SmartDevice {

    //como no encontré una diferencia entre el smartphone y el smartwatch voy a poner llamadas.
    protected boolean llamadas;

    //constructor vacio a llenar cuando quiera de smartphone
    public SmartPhone() {

    }

    public SmartPhone(String sistemaOperativo, Double tamañoDePantallaTactil, Double duracionDeLaBateriaEnH, String memoriaRam, String capacidadDeAlmacenamiento, boolean camaraDeFotos, boolean llamadas) {
        super(sistemaOperativo, tamañoDePantallaTactil, duracionDeLaBateriaEnH, memoriaRam, capacidadDeAlmacenamiento, camaraDeFotos);
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "llamadas=" + llamadas +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamañoDePantallaTactil=" + tamañoDePantallaTactil +
                ", duracionDeLaBateriaEnH=" + duracionDeLaBateriaEnH +
                ", memoriaRam=" + memoriaRam +
                ", capacidadDeAlmacenamiento=" + capacidadDeAlmacenamiento +
                ", camaraDeFotos=" + camaraDeFotos +
                '}';
    }
}
