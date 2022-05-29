package oops;

class Classroom {

	private int chaircount;
	private String teachername;
	private int students;
	

	public Classroom(int chaircount, String teachername, int students) {
		super();
		this.chaircount = chaircount;
		this.teachername = teachername;
		this.students = students;
	}


	public void details()
	{
		System.out.println("Chairs are - "+this.chaircount+" ,Students are - "+this.students+" ,NAme of teacher is -"+this.teachername);
	}



	public static void main(String[] args) {
		
		Classroom firstclass = new Classroom(20,"Varsala",15);
		Classroom secondclass = new Classroom(20,"Sharma",15);
		
		
		firstclass.details();
		
	}
	
	
	
}


//What is Class-

/*In simple word, we can say it’s a specification or a pattern/design which we define
and every object will follow that pattern.

*
*class is collection of object --- wrong.
*
*class provide base to create object
*/



//Access level of class:

/*Java class has mainly two type of access level:*/

//Default:
/* class  are accessible only inside the package.*/
 
//Public:
 /*class  are accessible in code in any package.*/


//What are members of Class?

/*When we create a class its totally incomplete without defining any member of this class 
same like we can understand one family is incomplete if they have no members.*/

			//data Members are :
			/*1. Field or variables - field is nothing but the property of the class or object
	  		  2. Methods- method is nothing but the operation that an object can perform*/

			//Access Level of members:
/*			Access level is nothing but where we can use that members of the class.
			Each field and method has an access level:*/

				//private
						/*: accessible only in this class*/
				//package or default : 
					/*accessible only in this package*/
				//protected :
					/*accessible only in this package and in all subclasses of this class*/
				//public :
					/*accessible everywhere this class is available*/




//Class Object is the root of the class hierarchy.
//Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.


//What element a Java class contain?
					/*
					 * 1. Instance Fields 
					 * 2. Static Fields 
					 * 3.Instance Methods 
					 * 4. Static Methods 
					 * 5. Constructors 
					 * 6.Initializer blocks (instance and static ) 
					 * 7.Nested/Inner class
					 * 8.Nested Interface
					 */


//How many variables in java?
		
		//Java has 2 type of variables :
		/**
		 * Primitive --8   ----for holding values
		 * 
		 *  Reference -4 , strong , weak(soft and phantom) for holding address
		 *  				Bydefault our reference is strong.
		 *  
		 */

//How many ways a variable can be declared?

		/**
		 * 1. Instance variable --if value of var varies
		 *  2. Static variables ---single per class
		 *  3. Local variables--method level
		 */


//Difference

		/*
		 * 1. Instance variable
		 * 						 -->creates seperate copy for each obj.
		 * 						---> must be declared inside class and outside method.
		 * 						---> created inside heap.
		 * 						---> live and die with object
		 * 						---->they can access from non-static method by implicitly.
		 * 						---->they can access from static method by explicitly.(using obj) 
		 * 						----> default value is accord to datatype
		 * 								int , byte , short=0
		 * 								long -0L
		 * 								double-0.0
		 * 								float-0.0f
		 * 								boolean - false
		 * 								reference - null
		 * 
		 * 
		 * 					----> Object level variable, instance variable , Attribute , property
		 * 
		 */



/**
 * 1. Static variable
 * 						 -->creates single copy for each obj.
 * 						---> must be declared inside class and outside any block.
 * 						---> created when java loads class and beacomes destroy when java unload the class.
 * 						---> live and die with class , scope is same as class.Math.PI
 * 						---->they can access from non-static method as well as static method.
 * 						
 * 						----> default value is accord to datatype
 * 								int , byte , short=0
 * 								long -0L
 * 								double-0.0
 * 								float-0.0f
 * 								boolean - false
 * 								reference - null
 * 
 * 
 * 					----> class level variable, shared variable , Attribute , property
 * 
 */


/*
 * 1. Local variable

 * 
 */



// Which modifier are not allowed with local variables?

/* private, public, static, transient, volatile */

/* Only final are allowed */