package com.company.vacunacion;

public class Familiar extends Persona {
    private String parentesco;

    public Familiar(String nombre, String cedula, int age, boolean riesgo, String parentesco) {
        super(nombre, cedula, age, riesgo);
        this.parentesco = parentesco;
    }

    public String getParentesco(){
        return parentesco;
    }

}
