package com.example.Task2;

import java.util.*;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentSorter.
 */
public class StudentSorter implements StudentOperations {
	
	/** The studentlist. */
	private ArrayList<Student> studentlist;
	
	/**
	 * Instantiates a new student sorter.
	 *
	 * @param studentlist the studentlist
	 */
	public StudentSorter(ArrayList<Student> studentlist) {
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
		System.out.println("sort students based on 1: firstname	2:lastname 3:Rollno"
		    + " 4: department");
		Scanner s=new Scanner(System.in);
		try {
				String selectedno=s.nextLine();
			
				int selectednumber=Integer.parseInt(selectedno);
				switch(selectednumber) {
				case 1:
						Collections.sort(getStudentList(),new SortByFirstName());
						for(Student i:getStudentList())
							System.out.println(i.details());
						break;
				case 2:
						Collections.sort(getStudentList(),new SortByLastName());
						for(Student i:getStudentList())
							System.out.println(i.details());
						break;
				case 3:
						Collections.sort(getStudentList(),new SortByRollNo());
						for(Student i:getStudentList())
							System.out.println(i.details());
						break;
			
				case 4:
						Collections.sort(getStudentList(),new SortByDept());
						for(Student i:getStudentList())
							System.out.println(i.details());
						
						break;
				default:
						System.out.println("enter valid input");
						s.close();
						break;
			}
			
	
		}
		catch(NumberFormatException e) {
			System.out.println("Input should not be null");
	           //System.out.println(e.getMessage());
		}
	}
}


