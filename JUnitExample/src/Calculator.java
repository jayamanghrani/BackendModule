
public class Calculator {

	public int add(int... numbers)
	{
		int total = 0;
		for(int i:numbers)
		{
			total = total+i;
			
		}
		return total;
	}
	
	
	  public int multiply(int... number) {
          int product = 1;
          
          for (int i : number) {
        	  product*= i;
          }
          return product;
  }
	
	
	  public String concat(String name)
	  {
		  String s= "previous"+name;
		  
		 
		  return s;
	  }
	  
	  
	
}
