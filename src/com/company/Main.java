package com.company;

import com.company.vacunacion.repositories.FileRepository;
import com.company.vacunacion.services.BitacoraService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());
        String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "",parentesco = "", marca, print ;

        while (true) {
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
            } else {
                System.out.println("Parentesco:");
                parentesco = in.nextLine();
            }
            System.out.println("Vacuna - Marca:");
            marca = in.nextLine();
            System.out.println("Quieres imprimir la Lista? (Si)");
            print = in.nextLine();
                if (print.equals("Si")){
                    for (String item: service.get()){
                        System.out.println(item);
                    }
                }

        }
    }
}

