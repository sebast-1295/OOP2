package com.company;
import com.company.vacunacion.entities.BitacoradeVacunas;
import com.company.vacunacion.entities.Familiar;
import com.company.vacunacion.entities.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar papa = new Familiar ("Martin", "12345", 55, false,"Papa");
        Familiar mama = new Familiar ("Edith", "9876", 60, true, "mama");

        List <Persona> familia = new ArrayList<>();
        familia.add(papa);
        familia.add(mama);

        List<BitacoradeVacunas> bitacora = new ArrayList <>();
        bitacora.add (new BitacoradeVacunas(papa, "Pzifer", new Date()));
        bitacora.add (new BitacoradeVacunas(mama, "Pzifer", new Date()));
    }


}

