package designPatterns;

import java.util.Scanner;

interface Currency {

	String getSymbol();
}



/*concreate Rupee class code*/
class Rupee implements Currency
{
	@Override
	public String getSymbol()
	{
		return "Rs";
	}	
}




/*Concrete US Dollar code*/
class US implements Currency 
{
    @Override
    public String getSymbol() {
           return "USD";
    }
}

/*Concrete SGD class Code*/
class Singapore implements Currency
{
    @Override
    public String getSymbol() {
           return "SGD";
    }
}

	
class Factory 
{
		public static Currency CurrencyCode(String countryname)
		{
			
			if(countryname.equalsIgnoreCase("India"))
			{
				return new Rupee();
				
			}
			else if(countryname.equalsIgnoreCase("Singapore"))
			{
				return new Singapore();
			}
			else if (countryname.equalsIgnoreCase("US"))
			{
				return new US();
			}
			
			 throw new IllegalArgumentException("No such currency");
			
			
		}
}	
		
		

class A7_Currency
{
	
		public static void main(String[] args)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter country name");
			String country = kb.next();			
			Currency cur= Factory.CurrencyCode(country);
			System.out.println("Currency of "+country+"--"+cur.getSymbol());
				kb.close();	
		}
}




