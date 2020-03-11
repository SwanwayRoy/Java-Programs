package com.niit.assessment.comparator;

import java.util.*;

public class SortbyMarks implements Comparator <Student>
{
	//Used for sorting in ascending order of roll number
		public int compare(Student a, Student b)
		{
			return a.marks - b.marks;
		}
}
