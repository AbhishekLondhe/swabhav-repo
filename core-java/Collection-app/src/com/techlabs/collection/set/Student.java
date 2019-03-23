package com.techlabs.collection.set;

public class Student implements Comparable {

	private int rollNo;
	private int standard;
	private String firstName;
	private String lastName;
	
	
	public Student(int rollNo,int standard,String firstName,String lastName) {
		this.rollNo=rollNo;
		this.standard=standard;
		this.firstName=firstName;
		this.lastName=lastName;
	}


	public int getRollNo() {
		return rollNo;
	}


	public int getStandard() {
		return standard;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null || this.getClass()!=obj.getClass())
			return false;
		Student s=(Student) obj;
		return ((s.rollNo==this.rollNo)&&(s.standard==this.standard));
	}	
	
	@Override
	public int hashCode() {
		return rollNo;
	}


	@Override
	public int compareTo(Object o) {	
		Student student = (Student) o;
		return this.rollNo - student.rollNo;
	}
}
