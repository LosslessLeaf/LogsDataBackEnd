package com.providencepolice.data.logs;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class QueryCaseData {

//	public static void main(String[] args) {
//		// create session factory
//		SessionFactory factory = new Configuration()
//								 .configure("hibernate.cfg.xml")
//								 .addAnnotatedClass(CaseLog.class)
//								 .buildSessionFactory();
//		
//		// create session
//		Session session = factory.getCurrentSession();
//		
//		try {
//			session.beginTransaction();
//			
//			List<CaseLog> caseLogs = session.createQuery("from CaseLog").getResultList();
//			
//			displayCaseLogs(caseLogs);
//		}
//		
//		finally {
//			factory.close();
//		}
//		
//	}

//	private static void displayCaseLogs(List<CaseLog> caseLogs) {
//		for (CaseLog caseLog : caseLogs) {
//			System.out.println(caseLog);
//		}
//	}
	
	public List<CaseLog> getAllCaseLogs() {
			SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(CaseLog.class)
				 .buildSessionFactory();
			
			List<CaseLog> caseLogs;

			// create session
			Session session = factory.getCurrentSession();
			
			try {
				
				session.beginTransaction();
				
				caseLogs = session.createQuery("from CaseLog").getResultList();
				
			}
			
			finally {
				factory.close();
			}		

			return caseLogs;
	}
	
	public List<CaseLog> getCaseLogsByCaseNumber(String caseNumber) {
			SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(CaseLog.class)
				 .buildSessionFactory();
			
			List<CaseLog> caseLogs;

			// create session
			Session session = factory.getCurrentSession();
			
			try {
				
				session.beginTransaction();
				
				caseLogs = session.createQuery("from CaseLog WHERE CaseLog.casenumber='" + caseNumber + "'").getResultList();
								
			}
			
			finally {
				factory.close();
			}
			

			return caseLogs;
	}
	
	
}
