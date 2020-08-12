package com.providencepolice.data.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import kong.unirest.json.JSONArray;

import com.google.gson.Gson;
import com.providencepolice.data.logs.CaseLog;

public class UpdateCaseData {
	
	public static List<CaseLog> updateAllLogs() throws Exception {
		final String json = API.GetCaseLogData();
		
		//		System.out.println(json);

		JSONArray caseJson = new JSONArray(json);
		
		List<CaseLog> caseLogs = new ArrayList<CaseLog>();
		
		for (int i = caseJson.length(); i > 0; i--) {
			CaseLog currentCase = new Gson().fromJson(caseJson.getJSONObject(i).toString(), CaseLog.class);
			saveCaseData(currentCase);
			caseLogs.add(currentCase);
		}
		
		return caseLogs;
	}

	private static void saveCaseData(CaseLog caseLog) {
		// create session factory
		SessionFactory factory = new Configuration()
								 .configure("hibernate.cfg.xml")
								 .addAnnotatedClass(CaseLog.class)
								 .buildSessionFactory();
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			session.save(caseLog);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
			session.close();
		}
	}
	
}
