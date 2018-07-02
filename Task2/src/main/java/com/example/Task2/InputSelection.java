/*
 * From package com.example.Taks2
 */
package com.example.Task2;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.NoSuchElementException;

// TODO: Auto-generated Javadoc
/**
 * The Class InputSelection.
 *
 * @author parsi saiteja
 */
public class InputSelection {

  /**
   * Select input.
   *
   * @throws RuntimeException
   *           the runtime exception
   * @throws IOException
   *           Signals that an I/O exception has occurred.
   */
  @SuppressWarnings("unchecked")
  public void selectInput() throws RuntimeException, IOException {
    try {
      Scanner sc = new Scanner(System.in);
      ListofStudents studentdetails = new ListofStudents();
      ArrayList<Student> StudentList = studentdetails.getListOfStudents();
      ArrayList<Student> copiedstudentList = (ArrayList<Student>) StudentList.clone();
      while (true) {
        System.out.println("please enter 1: Sorting 2:searching 3: printallstudendetails 4:exit\n");
        int selectedInput = Integer.parseInt(sc.nextLine());
        switch (selectedInput) {
        case 1:
          StudentOperations sortstudents = new StudentSorter(copiedstudentList);
          sortstudents.readerOperation();
          break;
        case 2:
          StudentOperations searchstudent = new StudentSearcher(StudentList);
          searchstudent.readerOperation();
          break;
        case 3:
          for (Student s : StudentList) {
            System.out.println(s.details());
          }
          break;
        default:
          sc.close();
          System.exit(0);
        }
      }
    } catch (NumberFormatException e) {
      // TODO Auto-generated catch block
      System.out.println("The value entered was not correctly specified.(or) inout shoukd not be null");
    } catch (NoSuchElementException exception) {
      System.out.println("The value entered was not correctly specified. .");

    }

  }
}
