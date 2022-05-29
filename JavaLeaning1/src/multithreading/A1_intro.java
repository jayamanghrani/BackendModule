package multithreading;

public class A1_intro {

}

//Multitasking
/*Ability to perform more than one task parallely*/



//Process Based Multitasking
			//Running program(tool/IDE/project) is  =  process
/*Suppose music player and Eclipse IDE both is running in your system 
then it means 2 process are running in your system*/
/*Ability to execute multiple processes at the same time is called process based multitasking.*/


//Thread Based Multitasking ==Multithreading


// thread 
/*is an execution path and so if a program has multiple execution path 
then we can say that it is multithreading or thread based multitasking*/

			//Singlethread Model ---when one method wait for previous  method to complete its execution, single execution path

			//Multithreaded model


//Benefits of multithreading

/*Utilization of CPU idle time.
Resource sharing
Make the program responsive*/


//How java helps us acheive multithreading ?

//1. By extending java.lang.Thread class
/*		a) Override the run method in your thread class
		b) call the start method  - 2 action [
										start method execute run method
										it return control to main method (if our run method have 100 lines h to jaruri nhi pehle 100 chle phir return kre execution)
										ex. M4_ThreadExample2 and M11_RunnableExample

because of this second action thread is more preferred than Runnable interface
]     */



//2. By implemented an interface called java.lang.Runnable (Why this option given by java)
/*	beacuse java class can extends only one class , if our java class already extending one class , 
	then we can't do multithreading by extending thread class.
*/


