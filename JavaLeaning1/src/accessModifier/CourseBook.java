package accessModifier;

public class CourseBook {

	public CourseBook()
	{
		Book b = new Book();
		b.issuecount=2;
		b.issueHistory();
	}
	
	
}


//Another way
/*
public class CourseBook extends Book{

	public CourseBook()
	{
		
		int c = issuecount;
		issueHistory();
	}
	
	
}*/