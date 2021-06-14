package com.company.vacunacion.services;

import com.company.vacunacion.entities.Amigo;
import com.company.vacunacion.entities.Familiar;
import com.company.vacunacion.entities.Persona;
import com.company.vacunacion.repositories.Repository;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String txtEdad,
                     String txtRiesgo, String txtisAmigo, String relacion,
                     String facebook,String parentesco, String marca){

        int edad = Integer.parseInt(txtEdad);
        boolean isAmigo = txtisAmigo.equals("A");
        boolean riesgo = txtRiesgo.equals("S");
        Persona persona;
        if (isAmigo){
            persona = new Amigo(nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre,cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }
    public List<String> get(){
        return this.repository.get();
    }
}
