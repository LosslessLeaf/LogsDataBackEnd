package com.providencepolice.data.logs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.providencepolice.data.api.API;
import com.providencepolice.data.api.UpdateCaseData;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LogResource {
	
	@Autowired
	private QueryCaseData logService;
	
	@GetMapping("/logs")
	public List<CaseLog> getAllLogs() {
		return logService.getAllCaseLogs();
	}
	
	@GetMapping("/logs/{casenumber}")
	public List<CaseLog> getLog(@PathVariable String casenumber) {
		return logService.getCaseLogsByCaseNumber(casenumber);
	}
	
	@GetMapping("/logs/caselogs/update")
	public List<CaseLog> updateAllCaseLogs() throws Exception {
		return UpdateCaseData.updateAllLogs();
	}
	
	
}
