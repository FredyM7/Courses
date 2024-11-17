package org.fmunera.pooclasesabstractas.form.validadores;

abstract public class Validador {

    protected String mensaje;

    abstract public String getMensaje();
    abstract public void setMensaje(String mensaje);
    abstract public boolean esValido(String valor);
}
