package collectionInterface;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/*Logically, Comparable interface compares “this” reference
with the object specified and Comparator in Java compares two different class objects provided.*/


class C7_TreeSetClassUsingComparable implements Comparable<C7_TreeSetClassUsingComparable>
{
	
	Integer marks;
	String name;
	  
	C7_TreeSetClassUsingComparable(Integer marks, String name) 
	{ 
		this.marks = marks;
		this.name=name;
	}
  
    // override toString method
    public String toString()
    {
    	return (" " + this.marks+this.name);
    	}
  
    // Override compareTo method to sort TreeSet in
    // accending order
    public int compareTo(C7_TreeSetClassUsingComparable stu)
    {
    	System.out.println("inside compareTo method , this.marks--"+this.marks);
    	System.out.println("stu.marks--"+stu.marks);
        return this.marks.compareTo(stu.marks);
    	
    }
}


 class UseC7_TreeSetClassUsingComparable {

	
/*	Comparable is meant for objects with natural ordering.
	which means the object itself must know how it is to be ordered.*/
	
	/*
	If any class implements Comparable interface in Java then collection 
	of that object either List or Array can be sorted automatically by using Collections.sort()*/
	public static void main(String[] args)
	{
	Set<C7_TreeSetClassUsingComparable> set= new TreeSet<C7_TreeSetClassUsingComparable>();
	 // Adding elements to the set
    set.add(new C7_TreeSetClassUsingComparable(500,"jaya"));
    set.add(new C7_TreeSetClassUsingComparable(300,"lata"));
    set.add(new C7_TreeSetClassUsingComparable(400,"divya"));
    set.add(new C7_TreeSetClassUsingComparable(100,"pooja"));
    set.add(new C7_TreeSetClassUsingComparable(200,"neha"));
	
	System.out.println(set);
	
	
	
	
	}	
}
