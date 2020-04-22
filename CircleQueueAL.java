import java.util.*;

public class CircleQueueAL {
    ArrayList arrayList;
    public CircleQueueAL() {
        arrayList = null;
    }
    
    public Object getFirstObject() {
        return arrayList.get(0);
    }
    
    public Object getLastObject() {
        int index = arrayList.size() - 1;
        return arrayList.get(index);
    }
    
    public Object getObject(int index) {
        return arrayList.get(index);
    }
    
    public void setNext(int currentIndex, Object object) {
        arrayList.add(currentIndex + 1, object);
    }
    
    public void setPrevious(int currentIndex, Object object) {
        arrayList.add(currentIndex - 1, object);
    }
    
    public void add(Object object) {
        arrayList.add(object);
    }
    
    public void delete() {
        arrayList.remove(0);
    }
    
    public String toString() {
        String queueToString = "[";
        for (int i = 0; i < arrayList.size(); i++) {
            queueToString += "("+ arrayList.get(i) +")";
            if (arrayList.get(i+1) != null) {
                queueToString += ", ";
            }
        }
        
        queueToString += "]";
        return queueToString;
    }
    
    public void insertionSort() {
        for (int i = 0; i < arrayList.size() - 1; i++) {
            
            // insertion sort key logic
            int k = i + 1;
            String swap = arrayList.get(k).toString();
            while( k > 0 && swap.compareTo(arrayList.get(k-1).toString()) < 0) {
                arrayList.set(k, arrayList.get(k-1));
                k--;
            }
            arrayList.set(k, swap);
        }
    }
    
    public void selectionSort() {
        int n = arrayList.size(); 
  
        for (int i = 0; i < n-1; i++) 
        { 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arrayList.get(j).toString().compareTo(arrayList.get(j).toString()) < 0)
                    min_idx = j;
  
            // Swap the found minimum element with the first 
            // element 
            Object temp = arrayList.get(min_idx);
            arrayList.set(min_idx, arrayList.get(i));
            arrayList.set(i, temp);
        } 
    }
}