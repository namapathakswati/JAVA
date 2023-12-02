package mypackage.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblstudent")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)    //auto increment rno no
	private int rno;
	private String name;
	private float english;
	private float maths;
	private float science;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, float english, float maths, float science) {
		super();
		this.rno = rno;
		this.name = name;
		this.english = english;
		this.maths = maths;
		this.science = science;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getScience() {
		return science;
	}
	public void setScience(float science) {
		this.science = science;
	}

}
