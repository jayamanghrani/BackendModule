package javaInterviewModule.JavaBasicsmodule1;

public class N7_CmdEx {

	public static void main(String[] args)               // java N7_CmdEx *
	{
		System.out.println(args.length);            // 5  - cmd line directory me jitni files h 
		
		
		//retriving args data
		for(String s: args)
		{
			System.out.println(s);
		}
	}
}


/*
 * output = 1 -- if passed hello 
 * output = 5 -- if passed *      [dir *.*]
 * output = 1 -- if passed +
 * output = 1 -- if passed -
 */