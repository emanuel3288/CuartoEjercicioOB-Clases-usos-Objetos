package com.exampleOB;

import com.exampleOB.SmartDevice;

public class SmartWatch extends SmartDevice {
    protected boolean reloj;

    public SmartWatch() {
    }

    public SmartWatch(String sistemaOperativo, Double tamañoDePantallaTactil, Double duracionDeLaBateriaEnH, String memoriaRam, String capacidadDeAlmacenamiento, boolean camaraDeFotos, boolean reloj) {
        super(sistemaOperativo, tamañoDePantallaTactil, duracionDeLaBateriaEnH, memoriaRam, capacidadDeAlmacenamiento, camaraDeFotos);
        this.reloj = reloj;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "reloj=" + reloj +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamañoDePantallaTactil=" + tamañoDePantallaTactil +
                ", duracionDeLaBateriaEnH=" + duracionDeLaBateriaEnH +
                ", memoriaRam=" + memoriaRam +
                ", capacidadDeAlmacenamiento=" + capacidadDeAlmacenamiento +
                ", camaraDeFotos=" + camaraDeFotos +
                '}';
    }
}
