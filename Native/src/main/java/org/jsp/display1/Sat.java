package org.jsp.display1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;
import org.jsp.display.Produce;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class Sat {
	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory fac=cfg.buildSessionFactory();
		Session session1=fac.openSession();
		Session session2=fac.openSession();
		Produce p=session1.get(Produce.class,1);
		System.out.println(p);
		session1.close();
		Produce p1=session2.get(Produce.class,1);
	    System.out.println(p1);
		session2.close();
		fac.close();
	}

}
