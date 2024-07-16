/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

import entity.patient;
import java.util.Iterator;

/**
 *
 * @author Tan Yi Nuo
 */
public interface circularQueue<T> {

    void enqueue(T pt);

    T dequeue();

    void dequeueSpecific(String data);

    T[] getValue();

    Iterator<T> getIterator();

    int index();

    void edit(patient data, T input);

    public boolean search(String name);

    public void addHashMap(String name, String email);

}
