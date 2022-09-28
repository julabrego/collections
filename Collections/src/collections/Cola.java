package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Cola {
    Queue<String> turnosAsignados = new LinkedList<String>();
    
    public void mainCola(){
        System.out.println(turnosAsignados);
        
        System.out.println("las colas o filas manejan la información con método PEPS");
        System.out.println("(PRIMERO ENTRADA - PRIMERO SALIDA)");
        
        turnosAsignados.add("John");
        turnosAsignados.add("Paul");
        turnosAsignados.add("George");
        turnosAsignados.add("Ringo");
        turnosAsignados.add("Mick");
        turnosAsignados.add("Keith");
        turnosAsignados.add("Charles");
        
        System.out.println("Orden en que ingresaron los datos: ");
        System.out.println(turnosAsignados);
        
        System.out.println("");
        
        System.out.println("Ahora puedo ir atendiendo cada turno en el mismo orden en que se registraron, iterando sobre el listado mientras haya resultados");
        System.out.println("El \"siguiente\" valor registrado en una cola se obtiene con .poll()");
        
        while(!turnosAsignados.isEmpty()   ){
            System.out.println(turnosAsignados.poll());
        }
    }
}
