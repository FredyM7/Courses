package org.fmunera.pooclasesabstractas.form.validadores;

import org.fmunera.pooclasesabstractas.form.validadores.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    public final int minCar = 10;
    {
        mensaje = "El campo %s debe tener mínimo %d caracteres y máximo %d caracteres";
    }
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
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
        //this.mensaje = String.format(this.mensaje, this.min, this.max);

        if(valor == null){
            return true;
        }

        int largo = valor.length();

        return (largo >= this.min && largo <= this.max);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(String.format(this.mensaje, campo, this.min, this.max));
    }
}
