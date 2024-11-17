package org.fmunera.pooclasesabstractas.form.validadores;

public class NumeroValidador extends Validador{

    {
        mensaje = "El campo %s debe ser un número";
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

        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
