package com.company.vacunacion.repositories;

import com.company.vacunacion.entities.BitacoradeVacunas;
import com.company.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class InMemoryRepository implements Repository {
    private final List<BitacoradeVacunas> db;

    public InMemoryRepository() {
        this.db = new ArrayList<>();
    }

    public void save (Persona persona, String marca, Date fecha){
        this.db.add(new BitacoradeVacunas(persona, marca, fecha));
    }

    public List<String> get(){
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat( "DD-MM-YY");
        for (BitacoradeVacunas item: db) {
            lines.add(item.getPersona().getNombre()
            + "-" + item.getMarca()
            + "-" + format.format(item.getFecha()));
        }
        return lines;
    }
}
