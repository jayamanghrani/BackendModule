package javaInterviewModule.JavaBasicsmodule2;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class A3_UtilClasses {

	public static void main(String[] args) {
		
		
		// Date class
		Date d= new Date();
		System.out.println("Date from date class "+d);
		
	
		// Calendar class
		
	Calendar c = Calendar.getInstance();/* [getInstance Calender ki derive ka obj dega] */
	System.out.println(c.getClass().getName());
	System.out.println("The current date is:"+ c.getTime());
	
	System.out.println("Time"+c.getTime());
	System.out.println(c.getCalendarType());
	System.out.println();
	
	System.out.println("MONTH "+c.get(Calendar.MONTH));
	System.out.println("Month 2nd way --"+c.get(2));
	System.out.println();
	
	System.out.println(Calendar.YEAR);
	System.out.println("Year-- "+c.get(Calendar.YEAR));
	System.out.println("Year 2nd way-- " + c.get(1)); /* [YEAR =1, 1 means get year return krega] */
	System.out.println();
	
	
	System.out.println("Date "+c.get(Calendar.DATE));
	System.out.println("Date 2nd way --"+c.get(5));
	System.out.println();
	
	System.out.println("Min "+c.get(Calendar.MINUTE));
	System.out.println(Calendar.MINUTE);
	
	System.out.println();
	System.out.println("Sec "+c.get(Calendar.SECOND));
	
	
	/*
	 * We can check values on internet
	 * https://docs.oracle.com/javase/7/docs/api/constant-values.html#java.util.Calendar.YEAR
	 */	
	
	/**
	 * Jo DB se date aati hu vo java.sql.Date ki hoti h , use conver krna pdta h
	 * java.util.Date me
	 */	
	
	// TimeZone class
	
/*	When we have to represent diff time zone, America, Australica ka time chaheye to Timezone le sakte
*/	
/*
 * har Timezone h usko ek ID/name mila hua h.
 * 
 * Our timezone is - Asia/kolkata
 * 
 * Java bydefault takes local timezone
 */	
	System.out.println("Timezone example");	
	String[] id= TimeZone.getAvailableIDs();	
	for(String s:id)
	{
		System.out.println(s);		
	}
	
	Calendar calendar = Calendar.getInstance();
	System.out.println("Current hour in India-"+calendar.get(Calendar.HOUR_OF_DAY));
	System.out.println(calendar.get(Calendar.MINUTE));
	
	TimeZone tz = TimeZone.getTimeZone("America/New_York");
	calendar.setTimeZone(tz);
	System.out.println("Current hour in NewYork-"+calendar.get(Calendar.HOUR_OF_DAY));
	System.out.println(calendar.get(Calendar.MINUTE)); 
	
	
	
	/*
	 * Date : represent complete date 
	 * Calendar : represent date individual components
	 *  Timezone : represents diff timezone
	 * 
	 * 
	 */	
	System.out.println("******************************************");
// Random class
	
	/* generates random values */
	
	Random r = new Random();
	System.out.println("Random value by Random class from (0-100)  "+r.nextInt(100));
	
	/*
	 * We have another way to generate random value Math.random -- it gives value
	 * from 0.0-0.9
	 */
	
	System.out.println(" random value from Math class(0.0-0.9) "+Math.random());
	
	System.out.println(" random value from Math class (0.0-0.9) in integer"+(int)(Math.random()*100));
	
	
	// Timer
	/* We will discuss in multithreading */
	
	System.out.println("******************************************");
	//StringTokenizer
	/* we use when we want to spilit string word content, will discuss later */
	
	Scanner kb= new Scanner(System.in);
	System.out.println("enter name");
	String fullname = kb.nextLine();
	StringTokenizer token = new StringTokenizer(fullname);
	
	while(token.hasMoreTokens())
	{
	System.out.println(token.nextToken());
	}
}
	}
