package com.company;
import com.company.vacunacion.entities.Amigo;
import com.company.vacunacion.entities.BitacoradeVacunas;
import com.company.vacunacion.entities.Familiar;
import com.company.vacunacion.entities.Persona;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        List<BitacoradeVacunas> bitacora = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese algun dato");
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
            Persona persona;
            System.out.println("Nombre:");
            nombre = in.nextLine();
            System.out.print("Cedula:");
            cedula = in.nextLine();
            System.out.println("Edad:");
            edad = in.nextLine();
            System.out.println("Riesgo(Sí/No):");
            riesgo = in.nextLine();
            System.out.println("Amigo/Familiar:");
            isAmigo = in.nextLine();
            if (isAmigo.equals("Amigo")) {
                System.out.println("Relacion:");
                relacion = in.nextLine();
                System.out.println("Facebook");
                facebook = in.nextLine();
                persona = new Amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("Sí"), relacion, facebook);
            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("Sí"), parentesco);
            }
            System.out.println("Vacuna - Marca:");
            marca = in.nextLine();

            bitacora.add( new BitacoradeVacunas(persona, marca, new Date()));

        }
    }
}

