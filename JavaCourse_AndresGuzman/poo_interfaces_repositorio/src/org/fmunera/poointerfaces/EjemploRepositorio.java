package org.fmunera.poointerfaces;

import org.fmunera.poointerfaces.modelo.*;
import org.fmunera.poointerfaces.repositorio.*;
import org.fmunera.poointerfaces.repositorio.excepciones.*;
import org.fmunera.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {

            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();

            repo.crear(new Cliente("Fredy", "Munera"));
            repo.crear(new Cliente("Jose", "Pérez"));
            repo.crear(new Cliente("Anibal", "Robledo"));
            repo.crear(new Cliente("Daniel", "Rodriguez"));

            //repo.crear(null); //insertar null tira excepción (personalizada)

            List<Cliente> clientes = repo.listar();
            clientes.forEach(System.out::println);

            System.out.println("======= PAGINABLE =========");
            List<Cliente> paginable = repo.listar(0, 3); //valor 'hasta' no es incluyente.
            paginable.forEach(System.out::println);

            System.out.println("======= ORDENABLE =========");
            List<Cliente> ordenable = repo.listar("nombre", Direccion.ASC);
            ordenable.forEach(System.out::println);

            System.out.println("======= EDITAR ============");
            Cliente joseActualizar = new Cliente("Jose", "Ortiz");
            joseActualizar.setId(2);
            repo.editar(joseActualizar);
            Cliente jose = repo.porId(2); //<0 o null tira excepción (personalizada)
            System.out.println(jose);

            System.out.println("============= ORDENABLE 2 ==============");
            repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

            System.out.println("============= ELIMINAR (Registro con id=2 eliminado)=================");
            repo.eliminar(2);
            repo.listar().forEach(System.out::println);

            System.out.println("========== TOTAL REGISTROS ===========");
            System.out.println(repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: "+e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: "+e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e){
            System.out.println("Genérica: "+e.getMessage());
            e.printStackTrace();
        }


    }
}
