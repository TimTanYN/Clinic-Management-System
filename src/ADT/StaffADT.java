package ADT;

import java.io.*;
import javax.lang.model.SourceVersion;
import entity.Staff;
import java.util.Iterator;


/**
 *
 * @author haoyi
 */
public class StaffADT<T> implements Stack<T>
{
    private T[] stack;
    final static int maxsize=5;
    int top=0;
    int index=0;
    int size = 0;
    int index1 = 0;
    

    public StaffADT() {
        top = 0;
        stack = (T[]) new Object[maxsize];
    }
    
        public static void main(String[] args) {

        StaffADT stADT = new StaffADT();
        Staff st = new Staff("id");
    }
        
    public void push(T st) //places an element on top of stack
    {
            if(isFull())
            {
                System.out.println("Stack is full");
            }
            else
            {
                stack[top] = st;
                top++;
            }
    }
    
    public T pop() //removes an element from stack
    {
        T popper = null;
        
        if(isEmpty())
        {
            return null;
        }
        else
        {
           top--;
           popper = (T)(stack[top]);
           stack[top] = null;
        }
        
        return popper;
    }
 
    public void updateStaff(Staff info, T insert)
    {
        int top1 = 0;
        int k = 0;
        int i = 0;
        int h = 0;
        int g = top;
        int f = 0;
        
        Object[] staffObj = getStack();
        for (i = 0; i < top; i++)
        {
            Staff st = (Staff) staffObj[i];
            if (info.getID().equals(st.getName()))
            {
                k = i;
            } 
            else 
            {
                System.out.println("No Staff ID found");;
            } 
        }
        
        T[] popConfirm = (T[]) new Object[10];
        
         while (h < top) {
            T popped = pop();
            popConfirm[h] = popped;
            h++;
        }
         
          for (f = 0; f < g; f++) {
            if (f != k) {
                push(popConfirm[f]);
                top1++;
            } else {
                push(insert);
                top1++;
            }
        }
   
    }
    
    public boolean isEmpty()
    {
         if(top == -1) 
         {
           return true;
         }
         else
         {
           return false;
         }
    }
    
    public boolean isFull()
    {
      if(top == maxsize)
      {
         return true;
      }
      else
      {
         return false;
      }
    }
    
    public T peek() // same as pop but doesnt remove element
    {
        T peeker = null;
        
       if(isEmpty())
       {
           return null;
       }
       else
       {
          peeker = (T)(stack[top-1]);
       }
      
       return peeker;
    }
    
    public T[] getStack() {
        return stack;
    }
    
    public int top() {
        return top;
    }
    
    public void popTarget(String info)
    {
        int top1 = 0;
        int k = 0;
        int i = 0;
        int h = 0;
        int g = top;
        int f = 0;
        
        Object[] staffObj = getStack();
        for (i = 0; i < top; i++)
        {
            Staff st = (Staff) staffObj[i];
            if (info.equals(st.getID()))
            {
                k = i;
            } 
            else 
            {
                System.out.println("No Staff ID found");;
            } 
        }
        
        T[] popConfirm = (T[]) new Object[10];
        
         while (h < top) {
            T popped = pop();
            popConfirm[h] = popped;
            h++;
        }
         top = 0;
         
          for (f = 0; f < g; f++) {
            if (f != k) {
                push(popConfirm[f]);
                top++;
            }
        }
   
    }
    
       public Iterator<T> getIterator() {
        return new IteratorforStack();
    }

    public class IteratorforStack implements Iterator<T> {

        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return nextIndex < top;

        }
       
        @Override
        public T next() {

            if (hasNext()) {
               
                T nextEntry = stack[nextIndex];
                nextIndex++;
                return nextEntry;
            } else {
                return null;
            }

        }

    }
}