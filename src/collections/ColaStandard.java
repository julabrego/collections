package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaStandard {

    Queue<String> listadoA = new LinkedList<>();
    Queue<String> listadoB = new LinkedList<>();

    Scanner input = new Scanner(System.in);
    char opcion;
    boolean ejecutando = true;

    public void ejecutar() {
        listadoA.offer("B");
        listadoA.offer("G");
        listadoA.offer("C");
        listadoA.offer("E");
        listadoA.offer("D");
        listadoA.offer("A");
        listadoA.offer("F");

        while (ejecutando) {
            while (!listadoA.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);
                
                System.out.println("Presione enter");
                input.nextLine();

                String letra = listadoA.poll();
                listadoB.add(letra);
            }
            while (!listadoB.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);

                System.out.println("Presione enter");
                input.nextLine();

                String letra = listadoB.poll();
                listadoA.add(letra);
            }
        }

    }
}
