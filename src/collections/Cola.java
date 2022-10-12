package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    // Cola / Fila standard: PRIMERO ENTRADA PRIMERO SALIDA
    Queue<String> turnosAsignados = new LinkedList<>();
    
    public void mainCola(){
        System.out.println(turnosAsignados);
        
        System.out.println("las colas o filas manejan la información con método PEPS");
        System.out.println("(PRIMERO ENTRADA - PRIMERO SALIDA)");
        
        turnosAsignados.offer("John");
        turnosAsignados.offer("Paul");
        turnosAsignados.offer("George");
        turnosAsignados.offer("Ringo");
        turnosAsignados.offer("Mick");
        turnosAsignados.offer("Keith");
        turnosAsignados.offer("Charles");
        
        System.out.println("Orden en que ingresaron los datos: ");
        System.out.println(turnosAsignados);
        
        System.out.println("");
        
        System.out.println("Ahora puedo ir atendiendo cada turno en el mismo orden en que se registraron, iterando sobre el listado mientras haya resultados");
        System.out.println("El \"siguiente\" valor registrado en una cola se obtiene con .poll(), que lo devuelve y lo remueve de la lista");
        
        while(!turnosAsignados.isEmpty()){
            System.out.println(turnosAsignados.poll());
        }
    }
}
