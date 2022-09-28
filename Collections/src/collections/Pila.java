package collections;

import java.util.Stack;

public class Pila {
    Stack<String> mazoDeCartas = new Stack<String>();
    
    public void mainPila(){
        System.out.println("El mazo de cartas inicia vacío");
        System.out.println(mazoDeCartas);
        
        System.out.println("");
        
        System.out.println("Ahora voy agregando cartas \"una encima de la otra\"");
        mazoDeCartas.add("1 de espada");
        mazoDeCartas.add("1 de basto");
        mazoDeCartas.add("7 de espada");
        mazoDeCartas.add("7 de oro");
        mazoDeCartas.add("3 de espada");
        mazoDeCartas.add("3 de copa");
        mazoDeCartas.add("3 de oro");
        mazoDeCartas.add("3 de basto");
        mazoDeCartas.add("7 de copa");
        mazoDeCartas.add("7 de basto");
        mazoDeCartas.add("6 de espada");
        mazoDeCartas.add("6 de copa");
        mazoDeCartas.add("6 de oro");
        mazoDeCartas.add("6 de basto");
        mazoDeCartas.add("5 de espada");
        mazoDeCartas.add("5 de copa");
        mazoDeCartas.add("5 de oro");
        mazoDeCartas.add("5 de basto");
        mazoDeCartas.add("4 de espada");
        mazoDeCartas.add("4 de copa");
        mazoDeCartas.add("4 de oro");
        mazoDeCartas.add("4 de basto");
        System.out.println("en este orden: ");
        System.out.println(mazoDeCartas);
        
        System.out.println("");
        
        System.out.println("Y ahora las voy \"DESAPILANDO\" de manera que sale PRIMERO la que fue agregada a lo ÚLTIMO (UEPS)");
        System.out.println("(ÚLTIMO ENTRADA - PRIMERO SALIDA)");
        
        while(!mazoDeCartas.isEmpty()){
            System.out.println(mazoDeCartas.pop());
        }
    }
}
