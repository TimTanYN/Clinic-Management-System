/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import java.util.Iterator;
import entity.appointment;

/**
 *
 * @author Tan Yi Nuo
 */
public class doubleEndedQueueADT <T> implements DoubleEndQueue<T> {

    static final int MAX = 100;
    T arr[];
    int front;
    int rear;
    int size;
    int index = 0;

    public doubleEndedQueueADT(int size) {
         arr = (T[]) new Object[size];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    // Checks whether Deque is empty or not.
    boolean isEmpty() {
        return (front == -1);
    }

 
    public void display(){
      Iterator it = getIterator();
      while(it.hasNext()){
          Object item = it.next();
          System.out.println(item);
      }
    }
    
   
    @Override
    public void enqueueRear(T apt) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }
        System.out.println("front " + front);

        if (front == -1) {
            front = 0;
            rear = 0;
        } else if (rear == arr.length - 1) {
            rear = 0;
        } else {
            rear = rear + 1;
             System.out.println(rear);
        }
       
        arr[rear] = apt;
        index++;
        System.out.println(index); 
    }
    
    @Override
    public void enqueueFront(T apt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dequeuefront(String data) {
        if ((front == -1) && (rear == -1)) {
            System.out.println("\nThere is no element to delete inside the deque");
        }
        else if (front == rear) {
            System.out.println("\nThe deleted element from the front is " + arr[front]);
            front = -1;
            rear = -1;
        } else if (front == (size - 1)) {
            System.out.println("\nThe deleted element from the front is " + arr[front]);
            front = 0;
        } else {
            System.out.println("\nThe deleted element from the front is " + arr[front]);
            front = front + 1;
        }
    }

    @Override
    public void dequeuerear(String data) {
        if ((front == -1) && (rear == -1)) {
            System.out.println("\nThere is no element to delete inside the deque");
        }
        // Deque has only one element
        if (front == rear) {
            System.out.println("\nThe deleted element from the rear is " + arr[rear]);
            front = -1;
            rear = -1;
        }
        else if (rear == 0){
            rear = size - 1;
        }
        else {
            rear = rear - 1;
        }
    }

     @Override
    public Iterator<T> getIterator() {
        return new DoubleEndedQueueIterator();
    }


    public class DoubleEndedQueueIterator implements Iterator<T> {

        private int nextIndex = front;

        @Override
        public boolean hasNext() {
            if (rear == 0) {
                return nextIndex < index;
            }
            
            return nextIndex <= rear;
        }

        @Override
        public T next() {
             if (hasNext()) {
                 System.out.println("Next Index before" + nextIndex);
                T nextEntry = arr[nextIndex];
                nextIndex+=1;
                 System.out.println("Next Index after" + nextIndex);
                return nextEntry;
            } else {
                return null;
            }
        }
    }
   
}
