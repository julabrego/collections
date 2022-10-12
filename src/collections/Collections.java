package collections;

import java.util.Scanner;

public class Collections {

    public static void main(String[] args) {
        int opcion;
        Scanner input = new Scanner(System.in);

        System.out.println("Elija qué ejemplo desea imprimir:");

        System.out.println("1) ArrayList de String");
        System.out.println("2) ArrayList de otros tipos");
        System.out.println("3) LinkedList de String");
        System.out.println("4) Cola / Queue");
        System.out.println("5) Pila / Stack");
        System.out.println("6) Ejercicio interactivo Cola / Queue");
        System.out.println("7) Ejercicio interactivo Cola con prioridad / PriorityQueue");
        System.out.println("8) Ejercicio interactivo Cola con prioridad / PriorityQueue con orden invertido");
        System.out.println("9) Ejercicio interactivo Pila / Stack");

        opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                ArrayListString lista = new ArrayListString();
                lista.mainListaArrayList();
                break;
            case 2:
                ArrayListOtrosTipos listaOtrosTipos = new ArrayListOtrosTipos();
                listaOtrosTipos.mainListaOtrosTipos();
                break;
            case 3:
                LinkedListString linkedListString = new LinkedListString();
                linkedListString.mainLinkedListString();
                break;
            case 4:
                Cola cola = new Cola();
                cola.mainCola();
                break;
            case 5:
                Pila pila = new Pila();
                pila.mainPila();
                break;
            case 6:
                ColaStandard colaStandard = new ColaStandard();
                colaStandard.ejecutar();
                break;
            case 7:
                FilaConPrioridad filaConPrioridad = new FilaConPrioridad();
                filaConPrioridad.ejecutar();
                break;
                case 8:
                FilaConPrioridadOrderInverso filaConPrioridadOrdenInverso = new FilaConPrioridadOrderInverso();
                filaConPrioridadOrdenInverso.ejecutar();
                break;
            case 9:
                EjercicioPila ejercicioPila = new EjercicioPila();
                ejercicioPila.ejecutar();
                break;
            default:
                System.out.println("Opción incorrecta");
        }

    }

}
