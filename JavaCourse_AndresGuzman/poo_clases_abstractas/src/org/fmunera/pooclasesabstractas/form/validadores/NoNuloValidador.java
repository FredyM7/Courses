package org.fmunera.pooclasesabstractas.form.validadores;

public class NoNuloValidador extends Validador{

    {
        mensaje = "El campo %s no puede ser nulo";
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null);
    }
}
