package oops;

public interface C1_MarkerInterface {

}

//empty interface in java is called a marker interface.

/*Example of marker interface is Serializable, Cloneable, and Remote interface.*/


//Use
/*they are used to indicate something to compiler or JVM.
So if JVM sees a Class is Serializable, it has done some special operation on it,
a similar way, if JVM sees one Class is implement Cloneable,
it performs some operation to support cloning. */


/*Particularly useful for developing API and frameworks like Spring or Struts.*/



/*After introducing Annotation on Java5,
Annotation is a better choice than the marker interface, and JUnit is a perfect example of using Annotation, 
e.g., @Test, for specifying a Test Class. The same can also be achieved by using a Test marker interface.*/



// Instead of Marker interface , we can use Marker Annotation

/*Example: - @TestAnnotation()

The only purpose is to mark a declaration.
These annotations contain no members and do not consist any data. 
Thus, its presence as an annotation is sufficient. 
Since, marker interface contains no members,
simply determining whether it is present or absent is sufficient. 
@Override is an example of Marker Annotation.
*/


//Three are included in java.lang: @Deprecated, @Override and @SuppressWarnings

/*Four are imported from java.lang.annotation: @Retention, @Documented, @Target, and @Inherited.
*/


/*Full Annotations:
These annotations consist of multiple data members/ name, value, pairs.

Example:- @TestAnnotation(owner=”Rahul”, value=”Class Geeks”)*/


