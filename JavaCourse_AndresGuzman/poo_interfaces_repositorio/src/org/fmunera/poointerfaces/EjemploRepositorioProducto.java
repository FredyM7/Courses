package org.fmunera.poointerfaces;

import org.fmunera.poointerfaces.modelo.Producto;
import org.fmunera.poointerfaces.repositorio.*;
import org.fmunera.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.fmunera.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.fmunera.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();

            repo.crear(new Producto("mesa", 50.52));
            repo.crear(new Producto("silla", 18));
            repo.crear(new Producto("lampara", 15.5));
            repo.crear(new Producto("notebook", 400.89));

            List<Producto> productos = repo.listar();
            productos.forEach(System.out::println);

            System.out.println("======= PAGINABLE =========");
            List<Producto> paginable = repo.listar(0, 3); //valor 'hasta' no es incluyente.
            paginable.forEach(System.out::println);

            System.out.println("======= ORDENABLE =========");
            List<Producto> ordenable = repo.listar("descripcion", Direccion.ASC);
            ordenable.forEach(System.out::println);

            System.out.println("======= EDITAR ============");
            Producto lamparaActualizar = new Producto("lampara escritorio", 23);
            lamparaActualizar.setId(3);
            repo.editar(lamparaActualizar);
            Producto lampara = repo.porId(3);
            System.out.println(lampara);

            System.out.println("============= ORDENABLE 2 ==============");
            repo.listar("precio", Direccion.ASC).forEach(System.out::println);

            System.out.println("============= ELIMINAR (Registro con id=2 eliminado)=================");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("========== TOTAL REGISTROS ===========");
            System.out.println(repo.total());

        } catch (LecturaAccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
