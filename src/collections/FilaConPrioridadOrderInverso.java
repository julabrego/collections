package collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FilaConPrioridadOrderInverso {

    Queue<Integer> listadoA = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> listadoB = new PriorityQueue<>(Collections.reverseOrder());

    Scanner input = new Scanner(System.in);
    char opcion;
    boolean ejecutando = true;

    public void ejecutar() {
        System.out.println("PriorityQueue ordena automáticamente sus datos");
        System.out.println("Si paso como \"Comparator\" Collections.reverseOrder() los datos se ordenan a la inversa");
        
        listadoA.add(3);
        listadoA.add(1);
        listadoA.add(4);
        listadoA.add(7);
        listadoA.add(6);
        listadoA.add(2);
        listadoA.add(5);
        listadoA.add(8);

        while (ejecutando) {
            while (!listadoA.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);
               
                System.out.println("Presione enter");
                input.nextLine();

                int numero = listadoA.poll();
                listadoB.add(numero);
            }
            while (!listadoB.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);

                System.out.println("Presione enter");
                input.nextLine();

                int numero = listadoB.poll();
                listadoA.add(numero);
            }
        }

    }
}
