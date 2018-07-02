package com.example.Task2;


// TODO: Auto-generated Javadoc
/**
 * The Class Student.
 */
public class Student {
	
	/** The rollno. */
	private int rollno;
    
    /** The firstname. */
    private String firstname;
    
    /** The lastname. */
    private String lastname;
    
    /** The department. */
    private String department;
	
	/**
	 * Instantiates a new student.
	 *
	 * @param firstname the firstname
	 * @param lastname the lastname
	 * @param rollno the rollno
	 * @param dept the dept
	 */
	public Student(String firstname,String lastname,int rollno,String dept) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.rollno=rollno;
		this.department=dept;
	}
	
	/**
	 * Gets the roll no.
	 *
	 * @return the roll no
	 */
	public int getRollNo() {
		return rollno;
	}
	
	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstname;
	}
	
	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastname;
	}
	
	/**
	 * Gets the dept.
	 *
	 * @return the dept
	 */
	public String getDept() {
		return department;
	}
	
	/**
	 * Details.
	 *
	 * @return the string
	 */
	public String details() {
		 return "[firstname=" + firstname + ", lastname=" + lastname
	                + ", rollno=" + rollno + ", dept=" + department+"]" ;
	}
	
	
}
