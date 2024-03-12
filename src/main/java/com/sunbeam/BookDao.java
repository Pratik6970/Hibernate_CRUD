package com.sunbeam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class BookDao implements AutoCloseable {
	private Session session;
	
	public BookDao() {
		SessionFactory factory = HbUtil.getsessionfactory();
		this.session = factory.openSession();
	}
     
	//select
	
	public Book getBook(int book_id)
	{
		
		Book b = session.get(Book.class, book_id);
		return b;
		
	}
	
	//insert
	
	public void addBook(Book b)
	{
		
		if(b!=null)
		{
			Transaction tx = null;
			try {
				
				tx=session.beginTransaction();
				session.save(b);
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
		}
		}
		
	}
	
	public void updateBook(Book b1)
	{
		
		if(b1!=null)
		{
			Transaction tx = null;
			try {
				
				tx=session.beginTransaction();
				session.update(b1);
				tx.commit();
				
			} catch (Exception e) {
				e.printStackTrace();
				tx.rollback();
		}
		}
		
	}
	
	public void deleteBook(int book_id)
	{
		Transaction tx = null;
		try {
			
			tx=session.beginTransaction();
			Book b2 = session.get(Book.class, book_id);
			session.delete(b2);
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public List<Book> getAllbook()
	{
		String hql = "from Book b";
		
		Query<Book>q=session.createQuery(hql);
		return q.getResultList();
		
	}
	
	
	
	
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
