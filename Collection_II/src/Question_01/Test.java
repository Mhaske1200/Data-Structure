package Question_01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) 
	{
		
		Set<Student> set = new HashSet<Student>();
			
	
			set.add(new Student(101, "Shubham", "Pune", 75));
			set.add(new Student(102, "Vishal", "Nanded", 85));
			set.add(new Student(103, "Sijay", "Pune", 65));
			set.add(new Student(104, "Utkarsh", "Satara", 88));
			set.add(new Student(105, "Mehta", "Pune", 95));
			set.add(new Student(106, "Shubham", "Mumbai", 75));
			set.add(new Student(107, "Vishal", "Satara", 85));
			set.add(new Student(108, "Sijay", "Nagpur", 65));
			set.add(new Student(109, "Utkarsh", "Mumbai", 88));
			set.add(new Student(110, "Mehta", "Pune", 95));
		
		System.out.println(set);
		

	}

}
