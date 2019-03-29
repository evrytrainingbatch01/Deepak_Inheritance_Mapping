package com.evry.tableperconcreate.bankAccount;


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
		
		Bank b = new Bank();
		b.setName("MyBank");
		
		BranchOne bo = new BranchOne();
		bo.setName("MyBankBranchOne");
		bo.setCity("Bangalore");
		
		BranchTwo bt=new BranchTwo();
		bt.setName("MyBankBranchTwo");
		bt.setCity("Mysore");
		
		session.persist(b);
		session.persist(bo);
		session.persist(bt);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("created 3 tables and inserted values");
    }
}
