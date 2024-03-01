package com.learning.core.day1;


public class D01P01 {

	 public static Book createBooks(String title, double price) {
	        Book book = new Book();
	        book.setBookTitle(title);
	        book.setBookPrice(price);
	        return book;
	    }
	 public static void showBooks(Book book) {
		   System.out.println("For show book method");
	        System.out.println("Book Title: " + book.getBookTitle() + " and price: " + book.getBookPrice());
	    }
		
	
	public static void main(String[] args) 
	{
		//for show book method
		 Book book = createBooks("java programming", 350.00);

	        showBooks(book);
	
	        //for getter setter method
	
	   Book b =  new Book();
	
	   b.setBookTitle("Java Programming");
	   b.setBookPrice(350.00);
	   

	   String n = b.getBookTitle();
	   double a = b.getBookPrice();

	   System.out.println("For getter setter method method");
	   System.out.println("Title: " +n);
	   System.out.println("Price: " +a);
	}


}
