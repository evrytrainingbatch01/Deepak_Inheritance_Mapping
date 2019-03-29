package com.evry.tableperhierarchy;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	StandardServiceRegistry sr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(sr).getMetadataBuilder().build();
		
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		Customer cu=new Customer();
		
		cu.setName("raju");
		
		RegCustomer rc=new RegCustomer();
		
        rc.setName("kanala");
        rc.setPrice(560.5);
		
        PartialCustomer pc=new PartialCustomer();
     
        pc.setName("babu");
        pc.setCity("hyd");
        pc.setCjob("Java devleoper");
        
		session.persist(cu);
		session.persist(rc);
		session.persist(pc);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("inserted row");
    }
}
