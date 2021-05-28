package com.company;
import com.company.familia.*;

public class Main {

    public static void main(String[] args) {

        Sebas bello = new Sebas("saludo", 55, "leer");
        Martin papa = new Martin( "Hola", 55, "leer");

        papa.setAge();
        System.out.println(papa.getAge());
        System.out.println(papa.getHobby());

        System.out.println("Hola Profes, muchas gracias por la ayuda");
    }


}

