/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import entity.patient;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Tan Yi Nuo
 */
public class patientADT<T> implements circularQueue<T> {

    private T[] arr;
    int SIZE = 10; // Size of Circular Queue
    int front, rear;
    int index = 0;
    int index1 = 0;
    int index2 = 0;
    HashMap<String, String> patient = new HashMap<>();

    public patientADT() {
        front = -1;
        rear = -1;
        arr = (T[]) new Object[SIZE];
    }

    public static void main(String[] args) {

        patientADT t = new patientADT();
        patient pt = new patient("name");

        t.enqueue(pt);
        String output = String.valueOf(t.arr[0]);
        System.out.println(output);
        System.out.println(t.arr[0].toString());
    }

    // Circular Queue implementation in Java
    // Check if the queue is full
    boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    // Check if the queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }

    // Adding an element
    @Override
    public void enqueue(T pt) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            arr[rear] = pt;
            System.out.println("Inserted " + pt.getClass().toString());
            index++;
            index1++;
        }
    }

    // Removing an element
    @Override
    public T dequeue() {
        patient element = new patient();
        T item = (T) element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            item = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */ else {
                front = (front + 1) % SIZE;
            }

        }
        if (index1 != 0) {
            index1--;
        }

        return item;
    }

    public void enqueues(T pt) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % SIZE;
            arr[rear] = pt;
            System.out.println("Inserted " + pt.getClass().toString());

        }
    }

    @Override
    public void dequeueSpecific(String data) {
        index1 = 0;
        Object[] pts = getValue();
        int j = 0;
        int x = 0;
        for (j = 0; j < index; j++) {
            patient p = (patient) pts[j];
            if (data.equals(p.getName())) {
                x = j;
                System.out.println(x);
            } else {
                System.out.println("no");

            }

        }
        int i = 0;
        T[] test = (T[]) new Object[10];

        while (i < index) {

            T deleted = dequeue();
            test[i] = deleted;
            i++;
        }
        System.out.println(index);
        int f = index;
        int k = 0;
        for (k = 0; k < f; k++) {
            if (k != x) {
                enqueues(test[k]);
                index1++;
            }
        }

    }

    @Override
    public int index() {
        return index1;
    }

    @Override
    public void edit(patient data, T input) {
        index1 = 0;
        Object[] pts = getValue();
        int j = 0;
        int x = 0;
        System.out.println(index);
        for (j = 0; j < index; j++) {
            patient p = (patient) pts[j];
            if (data.getName().equals(p.getName())) {
                x = j;
                System.out.println(x);
            } else if (p.getName() == null) {
                break;
            } else {
                System.out.println("no");

            }
        }
        int i = 0;
        T[] test = (T[]) new Object[10];

        while (i < index) {
            T deleted = dequeue();
            test[i] = deleted;
            i++;
        }
        System.out.println(index);
        int f = index;
        int k = 0;
        for (k = 0; k < f; k++) {
            if (k != x) {
                enqueues(test[k]);
                index1++;
            } else {
                enqueues(input);
                index1++;
            }
        }
    }
    
    @Override
    public boolean search(String name){
        return patient.containsKey(name);
        
    }

    @Override
    public T[] getValue() {

        return arr;
    }

    @Override
    public void addHashMap(String name, String email) {
       
        patient.put(name, email);
    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorforCircularQueue();
    }

    public class IteratorforCircularQueue implements Iterator<T> {

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return nextIndex < index1;

        }
       
        @Override
        public T next() {

            if (hasNext()) {
                System.out.println(nextIndex);
                System.out.println(index1);
                T nextEntry = arr[nextIndex];
                nextIndex++;
                System.out.println(nextIndex);
                return nextEntry;
            } else {
                return null;
            }

        }

    }
}
