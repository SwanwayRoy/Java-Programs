package com.niit.assessment.comparator;

class Student
{
	int rollno, marks;
	String name, course;

	public Student(int rollno, String name, String course, int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	//Used to print student details in main()
	public String toString()
	{
		return this.rollno + " " + this.name + " " + this.course + " " + marks;
	}
}