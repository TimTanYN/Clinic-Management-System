/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ADT;

import entity.Staff;
import java.util.Iterator;

/**
 *
 * @author haoyi
 */
public interface Stack<T> {
    void push(T st);
    T pop();
    T peek();
    T[] getStack();
    int top();
    void updateStaff(Staff info, T insert);
    void popTarget(String info);
   Iterator<T> getIterator();
}