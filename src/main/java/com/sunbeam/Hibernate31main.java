package com.sunbeam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Hibernate31main {
	
	public static void main(String[] args) {
		
		//SessionFactory factory = HbUtil.getsessionfactory();
		//Session session = factory.openSession();
		/*
		try(BookDao dao = new BookDao()) {
			Book b =dao.getBook(16);
			System.out.println("Book found "+b);
			
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		/*
		//insert
		try(BookDao dao = new BookDao()) {
		
			Book b = new Book();
			b.setBook_id(28);
			b.setSubject_name("history");
			b.setBook_name("The War");
			b.setAuthor_name("sonawane");
			b.setPrice(963.00);
			dao.addBook(b);
		} catch (Exception e) {
			e.printStackTrace();*/
		
		//update
		/*
		try(BookDao dao = new BookDao()) {
			
			Book b3 =dao.getBook(1003);
			b3.setAuthor_name("Rahul kale");
			dao.updateBook(b3);
			
		} catch (Exception e) {
			e.printStackTrace();*/
		
		//delete
		/*
		try(BookDao dao = new BookDao()) {
			dao.deleteBook(25);
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		*/
		
		//List of book
		
		try(BookDao dao = new BookDao()) {
			List<Book>books= dao.getAllbook();
			System.out.println("List of books are");
			for(Book b : books)
			{
				System.out.println(b);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	

}

