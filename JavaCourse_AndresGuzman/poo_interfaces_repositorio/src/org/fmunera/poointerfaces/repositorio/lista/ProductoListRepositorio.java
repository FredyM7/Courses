package org.fmunera.poointerfaces.repositorio.lista;

import org.fmunera.poointerfaces.modelo.Producto;
import org.fmunera.poointerfaces.repositorio.AbstractaListRepositorio;
import org.fmunera.poointerfaces.repositorio.Direccion;
import org.fmunera.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto objeto) throws LecturaAccesoDatoException {
        Producto p = porId(objeto.getId());
        p.setDescripcion(objeto.getDescripcion());
        p.setPrecio(objeto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {

        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {

            int resultado = 0;
            if(dir == Direccion.ASC){
                resultado = ordenar(campo, a, b);
            } else if (dir == Direccion.DESC){
                resultado = ordenar(campo, b, a);
            }

            return resultado;

        });

        return listaOrdenada;
    }

    public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;

        switch (campo){
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "descripcion" -> resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" -> resultado = a.getPrecio().compareTo(b.getPrecio());
        }

        return resultado;
    }
}
