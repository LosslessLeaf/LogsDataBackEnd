package com.providencepolice.data.logs;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class QueryCaseData {

	private static void displayCaseLogs(List<CaseLog> caseLogs) {
		for (CaseLog caseLog : caseLogs) {
			System.out.println(caseLog);
		}
	}
	
	public List<CaseLog> getAllCaseLogs() {
			SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(CaseLog.class)
				 .buildSessionFactory();
			
			List<CaseLog> caseLogs = new ArrayList<CaseLog>();

			// create session
			Session session = factory.getCurrentSession();
			
			try {
				
				session.beginTransaction();
				
				caseLogs = session.createQuery("from CaseLog").getResultList();
				
			}
			
			finally {
				session.close();
				factory.close();
			}		

			return caseLogs;
	}
	
	public List<CaseLog> getCaseLogsByCaseNumber(String caseNumber) {
			SessionFactory factory = new Configuration()
				 .configure("hibernate.cfg.xml")
				 .addAnnotatedClass(CaseLog.class)
				 .buildSessionFactory();
			
			
			List<CaseLog> caseLogs = new ArrayList<CaseLog>();

			// create session
			Session session = factory.getCurrentSession();
			
			try {

				System.out.println(caseNumber);
				System.out.println("Began transaction");
				session.beginTransaction();
				
				String queryString = "from CaseLog c where c.casenumber= : casenumber";
				
				Query<CaseLog> query = session.createQuery(queryString);
				query.setParameter("casenumber", caseNumber);

				caseLogs = query.list();
				

				displayCaseLogs(caseLogs);
			}
			
			finally {
				session.close();
				factory.close();
			}
			
			
			return caseLogs;
	}
	
	
}
