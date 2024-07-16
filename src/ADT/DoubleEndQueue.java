/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT;

import java.util.Iterator;

/**
 *
 * @author songj
 */
public interface DoubleEndQueue<T> {
    public Iterator<T> getIterator();
    
    void enqueueRear(T apt);
    
    void enqueueFront(T apt);
    
    void display();
    

    
    void dequeuefront(String data);
    
    void dequeuerear(String data);
}
