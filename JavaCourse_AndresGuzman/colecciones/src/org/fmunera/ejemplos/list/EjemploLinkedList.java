package org.fmunera.ejemplos.list;

import org.fmunera.ejemplos.modelo.Alumno;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();

        System.out.println(enlazada + ", size: "+ enlazada.size());
        System.out.println("está vacía: "+enlazada.isEmpty());

        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size: "+ enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addLast(new Alumno("Atenea", 6));

        System.out.println(enlazada + ", size: "+ enlazada.size());

        System.out.println("Primero: "+ enlazada.getFirst()); //Parecido al .peekFirst(), este ultimo no lanza exception si la lista está vacía, en ese caso devuelve null (Lo mismo para .peekLast()).
        System.out.println("Ultimo: "+ enlazada.getLast());
        System.out.println("Indice 2: "+enlazada.get(2));

        //Alumno zeus = enlazada.removeFirst(); //Elimina y devuelve el elemento que eliminó (el primero).// Parecido al .pollFirst(), este ultimo no lanza exception si la lista está vacía, en ese caso devuelve null (Lo mismo para .pollLast()). //El método .pop es equivalente al método .removeFirst //El .remove (sin ningún argumento()) también es equivalente al .removeFisrt.
        //enlazada.removeLast();
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ", size: "+ enlazada.size());

        enlazada.remove(new Alumno("Jano",7 ));
        System.out.println(enlazada + ", size: "+ enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println(enlazada + ", size: "+ enlazada.size());

        System.out.println("Indice de Lucas: "+enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ", size: "+ enlazada.size());
        System.out.println("Indice de Lucas: "+enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size: "+ enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("\n=========== Next");
        while(li.hasNext()){
            Alumno alumno = li.next();
            System.out.println(alumno);
        }
        System.out.println("=========== Previous");
        while(li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }



    }
}
