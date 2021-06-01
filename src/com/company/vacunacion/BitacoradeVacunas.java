package com.company.vacunacion;


import java.util.Date;
import java.util.List;

public class BitacoradeVacunas {

    private Persona persona;
    private String marca;
    private Date fecha;

    public BitacoradeVacunas (Persona persona, String marca, Date fecha) {
        this.persona = persona;
        this.marca = marca;
        this.fecha = fecha;

    }

        public Persona getPersona () {
            return persona;
        }

        public String getMarca () {
            return marca;
        }

        public Date getFecha () {
            return fecha;
        }
}
