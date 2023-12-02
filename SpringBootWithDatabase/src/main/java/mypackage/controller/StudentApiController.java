package mypackage.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.*;
import mypackage.repository.*;
import mypackage.service.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} , allowedHeaders = "*")


public class StudentApiController {

	@Autowired
	StudentService studservice;
	
	@GetMapping("api/student")
	public List<Student> GetAll(){
		return studservice.GetStudent();
	}
	
	@GetMapping("api/student/{id}")
	public Student GetById(@PathVariable("id")int rno) {
		return studservice.GetStudent(rno);
	}
	
	@PostMapping("api/student")
	public Student Add (@RequestBody Student st){
		return studservice.AddStudent(st);
	}
	
	@PutMapping("api/student")
	public Student Update(@RequestBody Student st) {
		return studservice.UpdateStudent(st);
	}
	
	@DeleteMapping("api/student/{id}")
	public Student DeleteStudent(@PathVariable("id")int id) {
		return studservice.DeleteStudent(id);
	}
	
}
