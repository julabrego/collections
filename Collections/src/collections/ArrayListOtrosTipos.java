package collections;

import java.util.ArrayList;

public class ArrayListOtrosTipos {
    ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
    ArrayList<Double> listaDeDoubles = new ArrayList<Double>();
    ArrayList<Character> listaDeCharacters = new ArrayList<Character>();
    
    public void mainListaOtrosTipos(){
        System.out.println("Agrego valores enteros");
        listaDeEnteros.add(1);
        listaDeEnteros.add(20);
        listaDeEnteros.add(4);
        listaDeEnteros.add(99);
        System.out.println(listaDeEnteros);
        
        System.out.println("Lo mismo se puede hacer con los otros tipos específicos");
        
        ArrayList generico = new ArrayList();
        generico.add("sstring");
        generico.add(2);
        generico.add(true);
        System.out.println(generico);
    }
}
