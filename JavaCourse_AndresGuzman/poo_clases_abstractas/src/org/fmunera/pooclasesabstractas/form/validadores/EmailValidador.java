package org.fmunera.pooclasesabstractas.form.validadores;

public class EmailValidador extends Validador{

    {
        mensaje = "El campo %s tiene un formato de correo inválido";
    }
    public final static String EMAIL_REGEX = "^(.+)@(.+)$";


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
        return valor.matches(EMAIL_REGEX);
    }
}
