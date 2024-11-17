package org.fmunera.poointerfaces.repositorio;

import org.fmunera.poointerfaces.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T objeto) throws AccesoDatoException;
    void editar(T objeto) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;

}
