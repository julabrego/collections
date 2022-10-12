package collections;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class EjercicioPila {

    Stack<Integer> listadoA = new Stack<Integer>();
    Stack<Integer> listadoB = new Stack<Integer>();

    Scanner input = new Scanner(System.in);
    char opcion;
    boolean ejecutando = true;

    public void ejecutar() {
        listadoA.push(1);
        listadoA.push(2);
        listadoA.push(3);
        listadoA.push(4);
        listadoA.push(5);
        listadoA.push(6);
        listadoA.push(7);

        while (ejecutando) {
            while (!listadoA.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);

                input.nextLine();

                int numero = listadoA.pop();
                listadoB.push(numero);
            }
            while (!listadoB.isEmpty()) {
                System.out.println("ListadoA: " + listadoA);
                System.out.println("ListadoB: " + listadoB);

                input.nextLine();

                int numero = listadoB.pop();
                listadoA.push(numero);
            }
        }

    }
}
