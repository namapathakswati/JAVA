package mypackage.service;
import mypackage.model.*;

import mypackage.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	StudentRepository studrepo;
	
	public Student AddStudent(Student st) {
		Student s=studrepo.save(st);
		return s;
	}
	
	public Student UpdateStudent(Student st) {
		Student s = studrepo.save(st);
		return s;
	}
	
	public List<Student> GetStudent(){
		return studrepo.findAll();
	}
	
	public Student GetStudent(int rno) {
		Student st = studrepo.findById(rno).get();
		return st;
	}
	
	public Student DeleteStudent(int rno) {
		Student st = GetStudent(rno);
		studrepo.delete(st);
		return st;
	}
}
