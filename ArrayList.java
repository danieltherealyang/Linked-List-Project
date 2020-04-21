public class ArrayList {
    private Object opaqueObject;
    private ArrayList prevNode;
    private ArrayList nextNode;
    
    /**
    *  Constructs a new element with object objValue,
    *  followed by object address
    *
    * @param  opaqueObject  Address of Object
    */
    public ArrayList(Object opaqueObject, ArrayList node)
    {
        setObject(opaqueObject);
        setPrevNode(node);
        setNextNode(null);
    }
    
    /**
    *  Clone an object,
    *
    * @param  node  object to clone
    */
    public ArrayList(ArrayList node)
    {
        opaqueObject = node.opaqueObject;
        prevNode = node.prevNode;
        nextNode = node.nextNode;
    }
    
    /**
    *  Setter for opaqueObjecg in ArrayList object
    *
    * @param  opaqueObject  Address of Object
    */
    public void setObject(Object opaqueObject)
    {
        this.opaqueObject = opaqueObject;
    }
    
    /**
    *  Setter for prevNode in ArrayList object
    *
    * @node    A ArrayList object that is prevNode to current Object
    */
    public void setPrevNode(ArrayList node)
    {
        this.prevNode = node;
    }
    
    /**
    *  Setter for nextNode in ArrayList object
    *
    * @node    A ArrayList object that is nextNode to current Object
    */
    public void setNextNode(ArrayList node)
    {
        this.nextNode = node;
    }
    
    /**
    *  Returns opaqueObject for this element
    *
    * @return    The opaqueObject associated with this element
    */
    public Object getObject()
    {
        return opaqueObject;
    }
    
    /**
    *  Returns reference to previous object in list
    *
    * @return    The pointer is to the previous object in the list
    */
    public ArrayList getPrevious()
    {
        return prevNode;
    }
    
    /**
    *  Returns reference to next object in list
    *
    * @return    The pointer is to the next object in the list
    */
    public ArrayList getNext()
    {
        return nextNode;
    }
}