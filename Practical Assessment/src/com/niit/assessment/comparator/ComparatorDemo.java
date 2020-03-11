package com.niit.assessment.comparator;

import java.util.*;

class ComparatorDemo
{
	public static void main (String args [])
	{
		int i;
		
		ArrayList <Student> al = new ArrayList <Student> ();

		al.add (new Student (100, "Tony Stark", "MCA", 100));
		al.add (new Student (101, "Steve Rogers", "BTech", 50));
		al.add (new Student (102, "Bruce Banner", "BCA", 99));

		System.out.println ("Unsorted Data : ");
		
		for (i=0; i<al.size(); i++)
			System.out.println(al.get(i));

		Collections.sort(al, new SortbyMarks());

		System.out.println("\nSorted by Marks");
		for (i=0; i<al.size(); i++)
			System.out.println(al.get(i));
	}       
}