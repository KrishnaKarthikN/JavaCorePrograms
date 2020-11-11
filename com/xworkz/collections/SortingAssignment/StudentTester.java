package com.xworkz.collections.SortingAssignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTester {

	public static void main(String[] args) {
		
		Student std1 = new Student(16, "Rohan", "J P Nagar");
		Student std2 = new Student(16, "Rahul", "R R Nagar");
		Student std3 = new Student(18, "Reka", "J P Nagar");
		Student std4 = new Student(14, "Ruhi", "RajajiNagar");
		
		List<Student> stdAL = new ArrayList<>();
		stdAL.add(std1);
		stdAL.add(std2);
		stdAL.add(std3);
		stdAL.add(std4);
		System.out.println("Before sorting");
		System.out.println(stdAL);
		
		System.out.println("After sorting");
		Comparator<Student> comparator1 = (o1, o2) -> o1.getName().compareTo(o2.getName());
		Comparator<Student> comparator2 = (o1, o2) -> o1.getAge() - o2.getAge();

		stdAL.sort(comparator1);
		System.out.println("Sorting By Name");
		System.out.println(stdAL);
		stdAL.sort(comparator2);
		System.out.println("Sorting By Age");
		System.out.println(stdAL);
		
	}

}
