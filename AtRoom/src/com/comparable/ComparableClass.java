package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Students(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Students() {
		super();
	}

	@Override
	public int compareTo(Students o) {

		return this.age - o.age;
	}
}

public class ComparableClass {
	public static List<Students> allStudents() {
		List<Students> list = new ArrayList<>();
		list.add(new Students(109, "AbuBakar", 20));
		list.add(new Students(105, "Wadood", 21));
		list.add(new Students(102, "Abrar", 20));
		list.add(new Students(101, "Tufail", 19));
		Collections.sort(list);
		for (Students students : list) {
			System.out.println(students.getId() + " \t" + students.getName() + " \t" + students.getAge());
		}

		return list;
	}

	public static void main(String[] args) {
		ComparableClass.allStudents();

	}

}
