package com.company.vacunacion;

public class Persona {

    private String nombre;
    private String cedula;
    private int age;
    private boolean riesgo;

    public Persona(String nombre, String cedula, int age, boolean riesgo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.age = age;
        this.riesgo = riesgo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getAge() {
        return age;
    }

    public boolean isRiesgo() {
        return riesgo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRiesgo(boolean riesgo) {
        this.riesgo = riesgo;
    }

}
