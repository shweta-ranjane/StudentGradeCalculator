package com.studGradeCal;

import java.util.Scanner;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the no. of Subjects: ");
		int noSub = sc.nextInt();
		
		int totalMarks = 0;
		for(int i=1; i<=noSub; i++) {
			System.out.print("Enter marks obtained in Subject "+i+": ");
			int marks= sc.nextInt();
			totalMarks += marks;
			
		}
		
		double avgPercentage = (double) totalMarks / noSub;
		String grade;
		if(avgPercentage >= 90) {
			grade="O+";
		}
		else if(avgPercentage >= 80) {
			grade = "O";
		}
		else if(avgPercentage >= 70) {
			grade = "A+";
		}
		else if(avgPercentage >= 60) {
			grade = "A";
		}
		else if(avgPercentage >= 50) {
			grade = "B+";
		}
		else if(avgPercentage >= 40) {
			grade = "B";
		}
		else{
			grade = "C";
		}
		
		System.out.println("Total Marks: "+totalMarks);
		System.out.println("Avrage Percentage: "+avgPercentage);
		System.out.println("Grade: "+grade);
		
	}

}
