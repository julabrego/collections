package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class FilaConPrioridad {

    Queue<Integer> listadoA = new PriorityQueue<>();
    Queue<Integer> listadoB = new PriorityQueue<>();

    Scanner input = new Scanner(System.in);
    char opcion;
    boolean ejecutando = true;

    public void ejecutar() {
        System.out.println("PriorityQueue ordena automáticamente sus datos");
        System.out.println("Si en el constructor del PriorityQueue no envío un \"Comparator\" ordena por defecto de menor a mayor o alfabéticamente");
        
        listadoA.offer(3);
        listadoA.offer(1);
        listadoA.offer(4);
        listadoA.offer(7);
        listadoA.offer(6);
        listadoA.offer(2);
        listadoA.offer(5);

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
