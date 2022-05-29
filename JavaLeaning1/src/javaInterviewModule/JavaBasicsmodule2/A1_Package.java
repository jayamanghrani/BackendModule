package javaInterviewModule.JavaBasicsmodule2;
public class A1_Package {

	public static int FAMILY_COUNT=6;	
	public static int NUM=5;
	
	public static void main(String[] args)
	{
		System.out.println("Hello");					
	}	
}

//what is package?
/* package is collection of related types(classes, interfaces, enums) */


/* Can use package to decrease class colliding
 * 
 * Ex. java.sql.Date and java.util.Date both class have same name , we can keep
 * same class name in java using different package
 */

// Benefits of package
		// 1. Code reuse 
		 /** 
		 * Ex.- We use Scanner class in our class using package -
		*  import java.util.Scanner
		*  
		*  we never say import Scanner directly
		* */
		
		
		// 2. Maintainability 
		
		//3. Object oriented principle of encapsulation and modularity   
		
		
		//4. Modularity
		/**
		 * ex. database related codes - util package server connectivity code -
		 * different pkg
		 */
		
		
// Drawbacks without package
		
		/**
		 * A class without a package can't be imported elsewhere.
		 *	
		 * Accidental overwriting of bytecode . 
		 * Ex. ek class bnai A.java(contain demo, Test) and second class B.java(Student, Test)
		 * bytecode (demo.class , Test.class)(Student.class , Test.class)
		 * 
		 * Test.class will override previous 
		 * 
		 * 
		 */
		
		
		
// How to create package
		
		/* 1. package name ex. package javaInterviewModule.module1  at the begginning of file*/
		/**
		 * .class file bhi esi pckage ke andar bnegi
		 * C:\JavaLearning\JavaLeaning1\bin\javaInterviewModule\module1
		 */
		
		
		/* 2. If we will not use package , our code will run but it is not recommended */
		
		/*
		 * 3. ek class me ek hi package ho sakta h , but import stmt kitne bhi ho sakte
		 * h.
		 */
		
		
		
// What is default package?
		/*
		 * when we create class in java without package. then java will keep that class/source code
		 * in default package.es default package ka koi naam nhi h,This package is anonymous esliye hmm defalut
		 * package vali classes ko kahi import bhi nhi kr sakte
		 */
		
		
		
		
// what is the package which java imports bydefault ?
		/*  java.lang  */
		
		
// Folder and package is different in java ?
		
		/**
		 * yes Folder is directory and 
		 * package is a directory where .class file reside
		 */
		
		
//Examples of package
		
		/*
		 * package in.scabhopal.example -- 3 level hierarchy package
		 */
		/*
		 * byte code -- in.scabhopal.example ke andar , with the help of switch -d
		 */
		
		
// How to compile the code which contain package through cmd
		
		/** javac -d . Demo.java 
		 * 
		 * -d = switch ------package needs to be created (agr h already to nhi bnayega)
		 *  . = period ----------pacakge has to be created in current location , agr . ki jagah C:\  likha to package C ke andarbn jayega
		 * 							
		 * agr code me hmne package in.scabhopal.example likha h 
		 * to eske anadr bnega Demo.class
		 * 
		 * This is additional info given to compiler
		 * */
		
		
//How to run the code which contain package through cmd
		
		
		/* java in.scabhopal.example.Add */
		
		
// That means eclipse jo command use krta h compile krne ke liye vo -d . use krke hogi
		
// That means eclipse jo cmd use krta h run krne ke liye usme package ka naam bhi rehta h 
		/* java javaInterviewModule.module1.UseO2_Example */
		
		
//imp Pt  about package-
		
		/*
		 * 1. optional 
		 * 2.one per source file.
		 *  3. package name convention - reverse the organization name ex. com.tcs
		 *  4. name should be in lower case.
		 *  
		 */
		
		
//Interview questions-
		
		/** How many packages in java? */			
		/*
		 * 1. Java basic input/output API 
		 * 2. Java networking API 
		 * 3.Java utility API
		 * 4.core lang API
		 */	
		
		
		/** by how many ways we can use Scanner? */
		
		/*
		 * 1. import java.util.*; -------------- implicit
		 * 2. import java.util.Sanner; ----------------explicit
		 * 3. java.util.Scanner kb = new Scanner ---------------fully qualified naming 
		 * 
		 * Priority
		 * 3>2>1
		 * 
		 * Ex.  import java.sql.*
		 *  import java.util.Date;
		 *  
		 *  java will take util ka Date
		 * 
		 */
		
		/** To paint basic graphics and images , which package should we use? */
		/* java.awt */
		
		/** To create lightweight components for GUI which package should we use?*/		
		/* javax.swing */
		
		/** To utilize data stream which pck should we use? */
		/* java.io; */
		
		/**To develop network appl which pkg? */
		/* java.net */
		
		/**To work with collection framework */
		/* java.util */
		
		/** To work with core class which pkg? */
		/* java.lang  (System, String , Object , Wrapper)*/
		
		/** To work with advance classes which pkg? */
		/* none, invalid */
		
		
		
// JAVA 14 contains 4569 classes and 224 pckg
		
		
		
// java.util package
		
		/*
		 * Collection classes | Date and Time     | utility classes 
		 * 		List		  |    Date           |        Scanner       
		 * 		Set	          |    Calender       |
		 * 		Map           |    Timezone       |
		 *                    |     Locale        |
		 							Currency  	  |
									Random
		 						StringTokenizer
		 							Timer
	 						
	Calendar is abstract class , and it's constructor is private , we will learn this in design pattern	. 						
		 						
		 */
		
		
// java.io package
		
		/* java provides two types of I/O facility 
		 * 
		 * 1. Char based-- Reader , Writer 
		 * 2. Byte based-- InputStream, OutputStream
		 * 
		 * Scanner introduced in java 5 , before that we use BufferReader to take input
		 * 
		 *  * */
		
		/** How many ways to take input from user? */	
		/* Buffer Reader  , Scanner , console
		 * 
		 * 1.
		 * InputStreamReader r = new InputStreamReader(System.in)
		 * BufferedReader br = new BufferedReader(r);
		 * 
		 * 2.
		 * Scanner kb = new Scanner(System.in);
		 * 
 
		 * If we want to take pwd from console, if we use Scanner it will show on console which is not good.
		 * 
		 * Console class java 6 onwards, ye echo kiye bger input leti h
		 * */
		
		
// java.net pckage
		
		/*
		 * Socket , ServerSocket --- connects 2 computers with each other.( to develop LAN chat app)
		 * 
		 * URL - connect different URL (WAN)
		 * 
		 * Inet4Address ,Inet6Address -represent Ip address of website

		 */
		
		
// Interview questions-
		
		/* HashMap ---- java util.HashMap; */
		
//what features are new to JSE 5 ?
		/* Static import, Autoboxing and unboxing, enhanced for loop */
		
		
// pck about true-
		/*
		 * 1. you can't import a class from the default package.
		* 2. A class in default pkg can only be used by other class in the default pkg
		* 
		* 3. A class in the default pkg can import classes in non-default packages
			 */
