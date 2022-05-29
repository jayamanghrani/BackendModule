package accessModifier;

public class A1_Intro {

}

//Access Modifier
/*Access modifier controls visibility/accessibility*/
/*can be applied to class, interface and enke member(class and instance variable ) and methods pe */
/*private , protected, default, public*/


/*public - least restrictive
private - most restrictive

protected- less restrictive than default
default - more restrictive than protected
*/


//public

/*Same package   -- accessible by object (UseBook)
Same package in unrelated class --accessible without import, but will access by object only  (CourseBook)

Seperate package   --accessible by import and object (House)
Seperate package but derived class--accessible by import and without object (StoryBook)

*/

//protected
/*Same package    -- accessible
Same package in unrelated class --accessible without import, but will access by object only

Seperate package   --Not accessible
Seperate package but should be derived class--accessible but by implicitly/import (not by creating object )



*/

//default (Package private) (package access ) 

/*Same package    -- accessible
Same package in unrelated class --accessible without import, but will access by object only

Seperate package   --Not accessible
Seperate package but should be derived class--Not accessible

*/



//UML diagram-

/*
 *	 # = protected
 * 	 + = public
 * 	 - =private
 * 	~ = default
 *  
 *  
 *  
 */
