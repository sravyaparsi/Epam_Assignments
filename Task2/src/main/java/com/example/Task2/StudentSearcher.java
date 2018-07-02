package com.example.Task2;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


// TODO: Auto-generated Javadoc
/**
 * The Class StudentSearcher.
 */
public class StudentSearcher implements StudentOperations {
	
	/** The studentlist. */
	private ArrayList<Student> studentlist;
	
	/**
	 * Instantiates a new student searcher.
	 *
	 * @param studentlist the studentlist
	 */
	public StudentSearcher(ArrayList<Student> studentlist) {
		this.studentlist=studentlist;
	}
	
	/**
	 * Gets the student list.
	 *
	 * @return the student list
	 */
	public ArrayList<Student> getStudentList(){
		return studentlist;
	}

	/* (non-Javadoc)
	 * @see com.example.Task2.StudentOperations#readerOperation()
	 */
	public void readerOperation() {
		// TODO Auto-generated method stub
		 System.out.println("Please Select for searching 1:Firstname 2:lastname 3:Rollno 4: dept");
		 @SuppressWarnings("resource")
		 Scanner sc =new Scanner(System.in);
		 String selectednumber= sc.nextLine();
		 try {
		   int count=0;
			 System.out.println("enter text");
			 String EnteredText=sc.nextLine();
			 ArrayList<Student> studentlist=getStudentList();
			 for(Student s:studentlist) {
			//   System.out.println(EnteredText+"  "+selectednumber);
			   if(selectednumber.equals("3")) {
			     if(s.getRollNo()==Integer.parseInt(EnteredText)) {
			       System.out.println(s.details());
			     }
			   }
				 if((s.getFirstName().equalsIgnoreCase(EnteredText)&&selectednumber.equals("1"))
						 ||(s.getLastName().equalsIgnoreCase(EnteredText)&&selectednumber.equals("2"))
						 || (s.getDept().equalsIgnoreCase(EnteredText)&&selectednumber.equals("4"))) 
				 {
				   System.out.println(s.details());
					 	count++;
				 }
			 }
			 if(count==0) {
			   System.out.println("student is not found ");
			 }
		 }
			 catch (NoSuchElementException e) {
	           System.out.println("Input should not be null");
	     }
		 
	}

}
