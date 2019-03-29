package com.evry.tableperhierarchy.hospital;


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
		
		Patient p=new Patient();
		p.setName("Roopesh");
		
		OutPatient rc=new OutPatient();
        rc.setName("Kannan");
        rc.setDoctorName("Dr Ratna");
        rc.setBillAmount(1000);
        rc.setCity("Bangalore");
		
        InPatient pc=new InPatient();
        pc.setName("Babu");
        pc.setDoctorName("Dr Manish");
        pc.setCity("Mysore");
        pc.setWardno(205);
        
		session.persist(p);
		session.persist(rc);
		session.persist(pc);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("inserted patient");
    }
}
