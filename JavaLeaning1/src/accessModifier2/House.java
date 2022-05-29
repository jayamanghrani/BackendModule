package accessModifier2;

import accessModifier.Book;

public class House {

	House()
	{
		Book book = new Book();  // Book class public h , import krke obj bna sakte h
		String value= book.isbn;
		book.printBook();
		
		//book.author;            // author and template are protected , can not access here in differnt pckg
		//book.modifyTemplate();   if House will extend Book , then only can access
		
	//	book.issuecount=2;   // issuecount memeber is default , can't access in different pkg
		
	}
}


//Book class is public ,and it's member is also public , so can be access in different pkg using import

// book ke members access krne ke liye Book ka obj bnana pdega , agar inheritance ki hoti h to obj nhi bnana hota h



// AGr members protected h to obj bna ke bhi access nhi kr skate , protected ke liye pckg same hona chaheye.