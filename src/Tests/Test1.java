package Tests;

import Exceptions.EmptyCollectionException;
import Interfaces.QueueADT;
import Queue.CircularArrayQueue;
import Queue.LinkedQueue;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão<br>
 * IPP - Instituto Politécnico do Porto<br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação<br>
 * </h3>
 * <p>
 * <strong>Author: </strong><br>
 * Joao Sousa<br>
 * <strong>Description: </strong><br>
 * 
 * </p>
 */

public class Test1 {
    
    
    public static void main(String[] args) throws EmptyCollectionException {
        QueueADT<String> LQueue = new LinkedQueue<>();
        
        System.out.println(LQueue.isEmpty());
        
        LQueue.enqueue("Olá1");
        LQueue.enqueue("Olá2");
        LQueue.enqueue("Olá3");
        LQueue.dequeue();
        LQueue.enqueue("Olá4");
        
        System.out.println(LQueue.first());
        System.out.println(LQueue.isEmpty());
        System.out.println(LQueue.size());
        System.out.println(LQueue.toString());
        
        System.out.println("\n\t------------------------------\t\n");
        
        QueueADT<String> CQueue = new CircularArrayQueue<>();
        
        System.out.println(CQueue.isEmpty());
        
        CQueue.enqueue("Olá1");
        CQueue.enqueue("Olá2");
        CQueue.enqueue("Olá3");
        CQueue.dequeue();
        CQueue.enqueue("Olá4");
        
        System.out.println(CQueue.first());
        System.out.println(CQueue.isEmpty());
        System.out.println(CQueue.size());
        System.out.println(CQueue.toString());
    }
    
}
