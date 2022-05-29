package collectionInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class C9_StudentSortingExample {

	 // instance member variables
    String name;
    int age;
    
    public C9_StudentSortingExample(String name, Integer i)
    {
    	this.name= name;
    	this.age= i;
    }
    
    @Override
    public String toString()
    {
    	
		return "{Student name is ->"+name+" Age is "+age+"}";
    	
    }
    
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args)
	{
		
		C9_StudentSortingExample obj1= new C9_StudentSortingExample("Ajay", 26);
		C9_StudentSortingExample obj2= new C9_StudentSortingExample("Sanjay", 20);
		C9_StudentSortingExample obj3= new C9_StudentSortingExample("Bijay", 24);
		C9_StudentSortingExample obj4= new C9_StudentSortingExample("Vijay", 23);
		C9_StudentSortingExample obj5= new C9_StudentSortingExample("Digvijay", 25);
		C9_StudentSortingExample obj6= new C9_StudentSortingExample("Rijay", 22);
		C9_StudentSortingExample obj7= new C9_StudentSortingExample("Lijay", 21);
		
		
		
		List<C9_StudentSortingExample> list= new ArrayList();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		list.add(obj5);
		list.add(obj6);
		list.add(obj7);
		
		
		System.out.println("before sorting "+list);
		// Now we will implement our logic for sorting
		
		Collections.sort(list,new MyComparator3());
		
		System.out.println("After own own sorting logic "+list);
		
	}
	
}


class MyComparator3 implements Comparator<C9_StudentSortingExample>
{

	@Override
	public int compare(C9_StudentSortingExample o1, C9_StudentSortingExample o2) {
		

		int res=o1.getAge().compareTo(o2.getAge());
				
		return res;
		
		/*Integer Compares two int values numerically. The value returned is identical to what would be returned by: 
		    Integer.valueOf(x).compareTo(Integer.valueOf(y))
		 */

		
				
	}
	

}





