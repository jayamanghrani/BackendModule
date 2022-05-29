package javaInterviewModule.StringCodingModule;

import java.math.BigDecimal;

public class C2_AvoidNullPointerException
{
	public static void main(String[] args) {
		
	//Case 1
	
	Object unknownObject = null;

	/* wrong way - may cause NullPointerException */
	if(unknownObject.equals("knownObject")){
	   System.err.println("This may result in NullPointerException if unknownObject is null");
	}

	/*
	 * right way - avoid NullPointerException even if unknownObject is null*/	
	if("knownObject".equals(unknownObject)){
	    System.err.println("better coding avoided NullPointerException");
	}
	
	
	
	// Case 2
	
	BigDecimal bd = null;
	System.out.println(String.valueOf(bd)); //doesn’t throw NPE
	System.out.println(bd.toString()); //throws "Exception in thread "main" java.lang.NullPointerException"


	/**
	 * Since calling toString() on null object throws NullPointerException, if we
	 * can get same value by calling valueOf() then prefer that, as passing null to
	 * valueOf() returns "null", specially in case of wrapper classes like Integer,
	 * Float, Double or BigDecimal.
	 */
	
	
	// Case 3 -- Using null safe methods and libraries
	//One of the most common one is StringUtils from Apache commons.

	
	/*
	 * System.out.println(StringUtils.isEmpty(null));
	 * System.out.println(StringUtils.isBlank(null));
	 * System.out.println(StringUtils.isNumeric(null));
	 * System.out.println(StringUtils.isAllUpperCase(null));
	 */
	
	
	// CAse-4 . Avoid returning null from a method, instead, return an empty collection or an empty array.

	/**
	 * By returning an empty collection or empty array you make sure that basic
	 * calls like size(), length() don't fail with NullPointerException. Collections
	 * class provides convenient empty List, Set, and Map as 
	 * Collections.EMPTY_LIST,
	 * Collections.EMPTY_SET and
	 *  Collections.EMPTY_MAP which can be used accordingly.
 
	 */
	
	/*
	 * public List getOrders(Customer customer)
	 * { 
	 * List result = Collections.EMPTY_LIST; 
	 * return result;
	 *  }
	 */

	
	
	
	
	
}}
