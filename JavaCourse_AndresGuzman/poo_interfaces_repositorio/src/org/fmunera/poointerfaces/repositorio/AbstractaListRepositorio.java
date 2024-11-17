package org.fmunera.poointerfaces.repositorio;

import org.fmunera.poointerfaces.modelo.BaseEntity;
import org.fmunera.poointerfaces.repositorio.excepciones.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {


    protected List<T> dataSource;

    public AbstractaListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {

        if (id==null || id <= 0) throw new LecturaAccesoDatoException("Id inválido, debe ser > 0, no null");

        T resultado = null;
        for(T cli : dataSource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break;

            }
        }

        if(resultado == null) throw new LecturaAccesoDatoException("No existe el registro con id: "+id);

        return resultado;
    }

    @Override
    public void crear(T objeto) throws EscrituraAccesoDatoException {

        if(objeto == null)
            throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        if(this.dataSource.contains(objeto))
            throw new RegistroDuplicadoAccesoDatoException("Error, el objeto con id "+objeto.getId()+" ya existe en el repositorio");

        this.dataSource.add(objeto);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException{
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
