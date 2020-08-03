package com.providencepolice.data.logs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
		
//	@DeleteMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
//		Todo todo = todoService.deleteById(id);
//		
//		if (todo!= null) {
//			return ResponseEntity.noContent().build();
//		}
//		
//		return ResponseEntity.notFound().build();
//	}
//	
//	@PutMapping("/users/{username}/todos/{id}")
//	public ResponseEntity<Todo> updateTodo(
//			@PathVariable String username,
//			@PathVariable long id, @RequestBody Todo todo) {
//		Todo todoUpdated = todoService.save(todo);
//		return new ResponseEntity<Todo>(todoUpdated, HttpStatus.OK);
//	}
//	
//	@PostMapping("/users/{username}/todos")
//	public ResponseEntity<Todo> updateTodo(
//			@PathVariable String username, @RequestBody Todo todo) {
//		Todo createdTodo = todoService.save(todo);
//		
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//			.buildAndExpand(createdTodo.getId()).toUri();
//		
//		return ResponseEntity.created(uri).build();
//	}
}
