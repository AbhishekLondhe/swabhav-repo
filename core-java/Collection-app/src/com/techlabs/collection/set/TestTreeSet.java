package com.techlabs.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String args[]) {
		Set<Student> set=new TreeSet<Student>();
		Student s1=new Student(101,10,"a","b");
		Student s2=new Student(101,10,"a","b");
		Student s3=new Student(102,10,"z","x");
		set.add(s1);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set.size());
	}
}
