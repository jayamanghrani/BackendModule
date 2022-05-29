package javaInterviewModule.ArrayModule;

public class A2_ArrayIntro
{
  public static void main(String[] args)
  {
	
	  int[] testScore = new int[4]; //primitive ka array
	  
	  String[] arr = new String[5];  // non-primitive array
	  	  
	  
	  String s = new String();
	  System.out.println(s.getClass().getName()); //java.lang.String
	  
	  
	  Thread[] ref = new Thread[5]; 
	  System.out.println(ref.getClass().getName());  //[Ljava.lang.Thread;
	  
	  String[] obj = new String[5];
	  System.out.println(obj.getClass().getName()); //[Ljava.lang.String;
}
}

//Very Important For Interview 

//Can you tell in how many objects the preceding code creates ?   Thread[] threads = new Thread[5]; 

/** Only 1 obj bnega heap me jiske andar array hoga, and 
 * 
 * refereed by ref created in stack , 
 * 
 * and vo Object kis class ka h jo heap me bna h-- Proxy class or Array class  [Ljava.lang.Thread;
 * 
 * reference kis type  ka h --Thread
 * 
 * */


