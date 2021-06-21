package com.company.vacunacion.entities;

public class Amigo extends Persona {

    private String relacion;
    private String facebook;

    public Amigo(String nombre, String cedula, int edad, boolean riesgo, String relacion, String facebook) {
        super(nombre, cedula, edad, riesgo);
        this.relacion = relacion;
        this.facebook = facebook;
    }
    public String getRelacion() {
        return relacion;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setRelacion() {
        this.relacion = relacion;
    }

}
