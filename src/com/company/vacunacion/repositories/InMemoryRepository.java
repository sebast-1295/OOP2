package com.company.vacunacion.repositories;

import com.company.vacunacion.entities.BitacoradeVacunas;
import com.company.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class InMemoryRepository implements Repository {
    private List<BitacoradeVacunas> bitacora;

    public InMemoryRepository() {
        this.bitacora = new ArrayList<>();
    }

    public void save (Persona persona, String marca, Date fecha){
        this.bitacora.add(new BitacoradeVacunas(persona, marca, fecha));
    }

    public List<String> get(){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat( "DD-MM-YY");
        for (BitacoradeVacunas item: bitacora) {
            lines.add(item.getPersona().getNombre()
            + "-" + item.getMarca()
            + "-" + format.format(item.getFecha()));
        }
        return lines;
    }
}
