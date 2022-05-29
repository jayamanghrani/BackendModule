package javaInterviewModule.JavaBasicsmodule2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A4_IOclasses {

	
	public static void main(String[] args) throws IOException {
		
		
		// 1. By BufferReader
		
		
		  InputStreamReader is = new InputStreamReader(System.in); 
		  BufferedReader br =new BufferedReader(is);
		  
		  System.out.println("enter name");
		  String name= br.readLine();
		 System.out.println(name);
		 
		
		//2. Using Scanner
		
		
		  Scanner kb = new Scanner(System.in);
		  System.out.println("Enter name"); 
		  String Fullname= kb.nextLine(); 
		  System.out.println(Fullname);
		 
		
		
		// Using console
		
		/*
		 * console ka hmm direct obj nhi bna sakte , System class ke pass ek method h
		 * usse milta h
		 */		
		
		System.out.println("using console-----");
		Console con = System.console();
		
		String username, password;	
		
		username = con.readLine("enter username");
		
		System.out.println("enter pwd");
		char[] pwd = con.readPassword();
		
		password = String.valueOf(pwd); /* or password = new String(pwd); */
		
		System.out.println("username:"+username);
		
		System.out.println("password:"+password);
		
//		ye prog cmd pe chl jayega but IDE pe NullpointerException dega 
//		because ide javaw.exe se chli h , and usme console nhi rehta

		//phir sysout kaise chlta h ?
				//ide apna virtual console bnati h , but Console class jo actual console chaheye rehta h
		
	}
	
	
}
