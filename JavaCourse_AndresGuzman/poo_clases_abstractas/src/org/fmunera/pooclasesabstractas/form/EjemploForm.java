package org.fmunera.pooclasesabstractas.form;

import org.fmunera.pooclasesabstractas.form.elementos.*;
import org.fmunera.pooclasesabstractas.form.elementos.select.Opcion;
import org.fmunera.pooclasesabstractas.form.validadores.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
             .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);
        experiencia.setValor("... más de 10 años de experiencia ...");

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python").setSelected())
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));
        //java.setSelected(true);

        ElementoForm saludar = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Este campo está desabilitado");

        username.setValor("");
        password.setValor("");
        email.setValor("");
        edad.setValor("20l");

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
        System.out.println();

        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });



    }
}
