package com.company.vacunacion.UI;

public class ErrorEnEdadException extends Exception {
    public ErrorEnEdadException(String edad) {
        super("La edad ingresada no es valida " + edad);
    }
}

