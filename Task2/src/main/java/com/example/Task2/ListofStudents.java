/*
 * from package com.example.Task2
 */
package com.example.Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;




// TODO: Auto-generated Javadoc
/**
 * The Class ListofStudents.
 */
public class ListofStudents {
	
	/**
	 * Gets the list of students.
	 *
	 * @return the list of students
	 * @throws RuntimeException the runtime exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public ArrayList<Student> getListOfStudents() throws RuntimeException, IOException{
		BufferedReader br = null;
		ArrayList<Student> listofstds = null;
		try {
			String csvFile = "C:\\Users\\parsi saiteja\\Documents\\New folder (2)\\task2.csv";
			br = null;
			String line = "";
			String cvsSplitBy = ",";
			listofstds = new ArrayList<Student>();
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
			        String[] str = line.split(cvsSplitBy);
			        Student s=new Student(str[0],str[1],Integer.parseInt(str[2]),str[3]);
			        listofstds.add(s);
			    }
			    //for searching
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("mention correct file path");
		}
		finally {
			br.close();
		}
		  return listofstds;
}
}
