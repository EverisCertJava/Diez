package mx.com.everis.certjava.building;

import mx.com.everis.certjava.library.Book;

public class House extends Book{
	public House() {
		Book book=new Book();
		book.author="ABC";
		book.modifyTemplate();
		
	}

}
