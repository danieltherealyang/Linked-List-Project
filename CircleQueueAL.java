import java.util.*;
public class CircleQueueAL {
    private ArrayList headNode;         // 1st element in Queue
    private ArrayList tailNode;         // Last element in Queue
    private ArrayList currentNode; 
    public CircleQueueAL()
    {
        headNode = null;
        tailNode = null;
        currentNode = null;
    }
    
    public Object getFirstObject()
    {
        currentNode = headNode;
    
        if (headNode == null)
            return null;
        else
            return headNode.getObject();
    }
    
    public Object getLastObject()
    {
        currentNode = tailNode;
    
        if (tailNode == null)
            return null;
        else
            return tailNode.getObject();
    }
    
    public Object getObject()
    {
        if (currentNode == null)
          return null;
        else
          return currentNode.getObject();
    }
    
    public void setNext()
    {
        currentNode = currentNode.getNext();
        
        // never let currentNode be null, wrap to head
        if (currentNode == null)
            currentNode = headNode;
    }
    
    public void setPrevious()
    {
        currentNode = currentNode.getPrevious();
        
        // never let currentNode be null, wrap to head
        if (currentNode == null)
            currentNode = tailNode;
    }
    
    public void add(Object opaqueObject)
    {
        // add new object to end of Queue
        // set opaqueObject
        // build previous link of tail (as current)
        tailNode = new ArrayList(opaqueObject, currentNode);
        
        // build next link of current (as tail)
        if (currentNode != null)
          currentNode.setNextNode(tailNode);
        
        // after links are established current eq tail
        currentNode = tailNode;
        
        // head eq tail on 1st element only
        if (headNode == null) {
            headNode = tailNode;
        }
    }
    
    public Object delete()
    {
        Object opaqueObject = null;
          
        if (headNode != null) {
            opaqueObject = headNode.getObject();
            headNode = headNode.getNext();
            if (headNode == null)
                tailNode = headNode;
            else
                headNode.setPrevNode(null);
        }
            
        return opaqueObject;
    }
    
    public String toString()
    {
        String queueToString = "[";
        
        ArrayList node = headNode;             // start from the head
        while (node != null)
        {
            queueToString += "("+node.getObject()+")";  // append the data to output string
            node = node.getNext();              // go to next node
            if (node != null)
                queueToString += ", ";
        }                                       // loop 'till queue ends
        queueToString += "]";
        return queueToString;
    }
    
    public void insertionSort() { 
        
        //two nodes needed for insertion sort indexes
        ArrayList node1 = headNode;
        ArrayList node2 = (node1 == null) ? null : node1.getNext();
        
        //continue while nodes remain in bounds
        while (node2 != null) { 
            
            //inner loop pointers for compares and shifts
            ArrayList slot1 = node1;
            ArrayList slot2 = node2;
                
            //key to be inserted into sorted slot
            ArrayList key = new ArrayList(node2);     //note: make key a different object, persistent/static in value (node2 moves)
            String keyText = node2.getObject().toString();
        
            //walks slots backwards until key position in found
            while ( slot1.getObject().toString().compareTo(keyText) > 0 ) {
                //shifts object greater than key value to the right in list
                slot2.setObject(slot1.getObject());
        
                //moves inner loop pointers
                slot1 = slot1.getPrevious();
                slot2 = slot2.getPrevious();
                
                //stop at the front of list
                if (slot1 == null)
                    break;
                
            }
            //place key in insertion position
            slot2.setObject(key.getObject());
        
            //advance insertion sort indexes
            node1 = node1.getNext();
            node2 = node2.getNext();
        } 
    } 
    
    public void selectionSort() {
        ArrayList node1 = headNode;
        while (node1.getNext() != null) {
            currentNode = node1.getNext();
            int min = 1;
            int currentIndex = 2;
            ArrayList minNode = node1;
            String minString = minNode.getObject().toString();
            while (currentNode != null) {
                if (currentNode.getObject().toString().compareTo(minString) < 0) {
                    minNode = currentNode;
                    min = currentIndex;
                    minString = minNode.getObject().toString();
                }
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            //swap
            currentNode = node1;
            for (int i = 1; i < min; i++) {
                currentNode = currentNode.getNext();
            }
            Object temp = currentNode.getObject();
            currentNode.setObject(node1.getObject());
            node1.setObject(temp); 
            
            node1 = node1.getNext();
        }
    }
}