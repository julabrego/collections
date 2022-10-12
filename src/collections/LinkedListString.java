package collections;

import java.util.LinkedList;

public class LinkedListString {
    LinkedList<String> listaLinkeadaDeNombres = new LinkedList<String>();
    
    public void mainLinkedListString(){
        System.out.println("La lista inicia vacía");
        System.out.println(listaLinkeadaDeNombres);

        System.out.println("");

        System.out.println("Le agrego valores usando add(\"valor\")");
        listaLinkeadaDeNombres.add("John");
        listaLinkeadaDeNombres.add("Paul");
        listaLinkeadaDeNombres.add("George");
        listaLinkeadaDeNombres.add("Ringo");

        System.out.println("");

        System.out.println("Ahora contiene los siguientes valores:");
        System.out.println(listaLinkeadaDeNombres);
        
        System.out.println("");
        
        System.out.println("Hasta acá es idéntica a ArrayList");
        System.out.println("La diferencia está en como que ArrayList es más eficiente para acceder a a items aleatorios");
        System.out.println("y LinkedList provée algunos métodos específicos muy útiles");
        
        System.out.println("");
        
        System.out.println(".addFirst()");
        listaLinkeadaDeNombres.addFirst("agrego al principio");
        
        System.out.println("");
        
        System.out.println(".addLast()");
        listaLinkeadaDeNombres.addLast("agrego al final");
        
        System.out.println("");
        System.out.println(listaLinkeadaDeNombres);
        
        System.out.println("");
        
        System.out.println(".getFirst() y .getLast()");
        System.out.println(listaLinkeadaDeNombres.getFirst());
        System.out.println(listaLinkeadaDeNombres.getLast());
        
        System.out.println("");
        
        System.out.println(".removeFirst() y .removeLast()");
        listaLinkeadaDeNombres.removeFirst();
        listaLinkeadaDeNombres.removeLast();
        System.out.println(listaLinkeadaDeNombres);
        
        System.out.println("");
                        
        
    }
}
