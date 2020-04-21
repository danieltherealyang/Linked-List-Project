public class Diseases extends Generics {
 

    /* fields
     * 
     */
    public static final String type = "Diseases";
    public enum KeyType {combo, name};
    public static KeyType key = KeyType.combo;
    private String name; 
    
    /* constructor
     * 
     */
    public Diseases(String name)
    {
    	this.setType(type);
    	this.name = name;  
    }
    
    /* 
     * toString provides output based off of this.key setting
     */
    @Override
    public String toString()
    {
    	String output="";
    	switch(key) {
    	case name:
    		output += this.name;
    		break;
    	case combo:
    	default:
    		output += type + ": " + this.name;
    	}
    	return output;
    	
    }
    
    /* Initialize Animal data
     * 
     */
    public static Generics[] diseaseData() {
    	Generics[] dd = { 
    			new Diseases("HIV"),
    			new Diseases("AIDS"),
    			new Diseases("Cancer"),
    			new Diseases("Yellow Fever"),
    			new Diseases("Pellagra"),
    			new Diseases("Mad Cow")
    	};
    	return dd;
    }
    
    /* main to test Animal class
     * 
     */
    public static void main(String[] args)
    {
    	Generics[] dd = diseaseData();
    	for(Generics a : dd)
    		System.out.println(a);
    }
}    