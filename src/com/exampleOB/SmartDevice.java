package com.exampleOB;

public class SmartDevice {
    protected String sistemaOperativo;
    Double tamañoDePantallaTactil;

    Double duracionDeLaBateriaEnH;
    String memoriaRam;
    String capacidadDeAlmacenamiento;

    boolean camaraDeFotos;

    // Constructor vacio
    public SmartDevice() {
    }

    // Constructor que utiliza todos los atributos de la clase
    public SmartDevice(String sistemaOperativo, Double tamañoDePantallaTactil, Double duracionDeLaBateriaEnH, String memoriaRam, String capacidadDeAlmacenamiento, boolean camaraDeFotos) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamañoDePantallaTactil = tamañoDePantallaTactil;
        this.duracionDeLaBateriaEnH = duracionDeLaBateriaEnH;
        this.memoriaRam = memoriaRam;
        this.capacidadDeAlmacenamiento = capacidadDeAlmacenamiento;
        this.camaraDeFotos = camaraDeFotos;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamañoDePantallaTactil=" + tamañoDePantallaTactil +
                ", duracionDeLaBateriaEnH=" + duracionDeLaBateriaEnH +
                ", memoriaRam=" + memoriaRam +
                ", capacidadDeAlmacenamiento=" + capacidadDeAlmacenamiento +
                ", camaraDeFotos=" + camaraDeFotos +
                '}';
    }
}
