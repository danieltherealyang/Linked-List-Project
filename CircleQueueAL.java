import java.util.*;

public class CircleQueueAL {
    ArrayList<Object> arrayList = new ArrayList<Object>();
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
            if (i == arrayList.size() - 1) {
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
        for (int i = 0; i < arrayList.size(); i++) {
            int pos = i;
            for (int j = i; j < arrayList.size(); j++) {
                if (arrayList.get(j).toString().compareTo(arrayList.get(pos).toString()) < 0) {
                    pos = j;
                }
            }
            Collections.swap(arrayList, i, pos);
            //System.out.println(arrayList);
        }
    }
}