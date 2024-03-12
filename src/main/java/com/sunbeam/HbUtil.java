package com.sunbeam;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbUtil {
	
	private static SessionFactory factory;
	
	static {
		try {
			Configuration cfg = new Configuration();
			cfg.configure();
			factory = cfg.buildSessionFactory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
public static SessionFactory getsessionfactory()
{
	return factory;
	
}
public static void shutdown()
{
	factory.close();
}
}
