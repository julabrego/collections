package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListString {

    // Instancio un ArrayList que va a contener Strings
    ArrayList<String> listaDeNombres = new ArrayList<String>();

    public void mainListaArrayList() {
        System.out.println("La lista inicia vacía");
        System.out.println(listaDeNombres);

        System.out.println("");

        System.out.println("Le agrego valores usando add(\"valor\")");
        listaDeNombres.add("John");
        listaDeNombres.add("Paul");
        listaDeNombres.add("George");
        listaDeNombres.add("Ringo");

        System.out.println("");

        System.out.println("Ahora contiene los siguientes valores:");
        System.out.println(listaDeNombres);

        System.out.println("");

        System.out.println("Para acceder a un valor en particular uso .get(indice). Los índices arrancan desde 0, igual que los arrays");
        System.out.println("Nombre 0: " + listaDeNombres.get(0));
        System.out.println("Nombre 2: " + listaDeNombres.get(2));

        // Si quiero leer un índice que no existe da error
//        System.out.println("Nombre 5 (que es inexistente): " + listaDeNombres.get(5));
        System.out.println("");
        System.out.println("Puedo recorrer un ArrayList usando for each");

        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }

        System.out.println("");

        System.out.println("Puedo saber la extensión del listado usando .size()");
        System.out.println("Extensión de la lista: " + listaDeNombres.size());

        System.out.println("");

        System.out.println("Pero en cualquier momento puedo agregarle más valores, porque la extensión es variable");
        listaDeNombres.add("Mick");
        listaDeNombres.add("Kate");
        listaDeNombres.add("Ronnie");
        listaDeNombres.add("Charles");

        System.out.println("Nueva extensión de la lista: " + listaDeNombres.size());
        System.out.println(listaDeNombres);

        System.out.println("");
        
        System.out.println("Los valores pueden repetirse:");
        listaDeNombres.add("Ringo");
        listaDeNombres.add("Ringo");
        listaDeNombres.add("Ringo");
        
        System.out.println(listaDeNombres);
        
        System.out.println("");
        
        System.out.println("Borrar un valor es muy fácil. Simplemente se usa .remove(indice), y el objeto ArrayList hace el resto");
        
        System.out.println("");
        
        System.out.println("borro índice 3");
        System.out.println(listaDeNombres);
        listaDeNombres.remove(3);
        System.out.println(listaDeNombres);
        
        System.out.println("");
        
        
        System.out.println("borro índice 5");
        System.out.println(listaDeNombres);
        listaDeNombres.remove(5);
        System.out.println(listaDeNombres);
        
        System.out.println("");
        
        System.out.println("borro índice 0");
        System.out.println(listaDeNombres);
        listaDeNombres.remove(0);
        System.out.println(listaDeNombres);
        
        System.out.println("");
        
        System.out.println("Se puede ordenar alfabéticamente muy fácil usando el método estático Collections.sort");
        Collections.sort(listaDeNombres);
        System.out.println(listaDeNombres);
        
        System.out.println("");
        
        System.out.println("O en orden inverso sumándole a sort el parámetro Collections.reverseOrder()");
        Collections.sort(listaDeNombres, Collections.reverseOrder());
        System.out.println(listaDeNombres);
        

    }

    // Ahora puedo empezar a agregarle datos del tipo que le indicamos
    private void llenarListaDeNombres() {

    }

}
