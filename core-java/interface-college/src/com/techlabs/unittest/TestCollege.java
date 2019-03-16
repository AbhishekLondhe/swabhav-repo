package com.techlabs.unittest;

import org.junit.Test;

import com.techlabs.college.BranchType;
import com.techlabs.college.Student;

public class TestCollege {

	Student student=new Student(4,"andheri","5 mar",BranchType.COMP);
	@Test
	public void checkStudentOrNot() {
		int Actual=student.getId();
		int Expected=5;
	}
	
}
