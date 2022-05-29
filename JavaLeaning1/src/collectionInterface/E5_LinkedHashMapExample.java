package collectionInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class E5_LinkedHashMapExample {

	private String name;
	private int id;
	
	public String getName()
	{
		return name;		
	}
	public int getId()
	{
		return id;		
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "E5_LinkedHashMapExample [name=" + name + ", id=" + id + "]";
	}
	public E5_LinkedHashMapExample(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		 System.out.println("In equals method");
	        if (obj instanceof E5_LinkedHashMapExample) {
	        	E5_LinkedHashMapExample emp = (E5_LinkedHashMapExample)obj;
	            return (emp.name.equals(this.name)
	                    && emp.id == this.id);
	        }
	        else {
	            return false;
	        }
	
}
}

 class UseE5_LinkedHashMapExample
{
	
public static void main(String[] args)
{
	
	LinkedHashMap<E5_LinkedHashMapExample, Integer> hm = new LinkedHashMap<E5_LinkedHashMapExample,Integer>();
	
	hm.put(new E5_LinkedHashMapExample("John",1020),1);
	hm.put(new E5_LinkedHashMapExample("John",1021),2);
	hm.put(new E5_LinkedHashMapExample("John",1022),3);


	   // Print LinkedHashMap
	
		for(Map.Entry<E5_LinkedHashMapExample, Integer> m :hm.entrySet())
		{
			System.out.println("key:"+m.getKey());
			System.out.println("value:"+m.getValue());		
		}

	
		System.out.println("duplicate key addition");
	   // Create duplicate entry	
		E5_LinkedHashMapExample duplicate = new E5_LinkedHashMapExample("John", 1021);
	
		
	    // Add duplicate entry
		hm.put(duplicate, 4);
	
		
		// After insertion
		for(Map.Entry<E5_LinkedHashMapExample, Integer> m :hm.entrySet())
		{
			System.out.println("key:"+m.getKey());
			System.out.println("value:"+m.getValue());		
		}
		
	
}


}




