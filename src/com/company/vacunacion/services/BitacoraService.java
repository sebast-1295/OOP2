package com.company.vacunacion.services;

import com.company.vacunacion.entities.Amigo;
import com.company.vacunacion.entities.Familiar;
import com.company.vacunacion.entities.Persona;
import com.company.vacunacion.repositories.Repository;
import com.company.vacunacion.UI.ErrorEnEdadException;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository){
        this.repository = repository;
    }
    public void save(String Nombre, String cedula, String txtEdad,
                     boolean riesgo, boolean Amigo, String relacion,
                     String facebook,String parentesco, String marca) throws ErrorEnEdadException{

        int edad;
        try {
            edad = Integer.parseInt(txtEdad);
        } catch (NumberFormatException x) {
            throw new ErrorEnEdadException(txtEdad);
        }

        Persona persona;
        if (Amigo){
            persona = new Amigo(Nombre, cedula, edad, riesgo, relacion, facebook);
        } else {
            persona = new Familiar(Nombre,cedula, edad, riesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }
    public List<String> get(){
        return this.repository.get();
    }
}
