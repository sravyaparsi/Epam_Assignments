package com.example.Task2;

import java.util.Comparator;

// TODO: Auto-generated Javadoc
/**
 * The Class SortBYMethod contains all classes used for sorting by name,rollno,dept
 */
 class SortByLastName implements Comparator<Student>{
  public int compare(Student m1, Student m2)
    {
        return m1.getLastName().compareTo(m2.getLastName());
    }
}

 class SortByFirstName implements Comparator<Student>{
  public int compare(Student m1, Student m2)
    {
        return m1.getFirstName().compareTo(m2.getFirstName());
    }
}
 class SortByRollNo implements Comparator<Student>
 {
   public int compare(Student m1, Student m2) {
     // TODO Auto-generated method stub
     if (m1.getRollNo() < m2.getRollNo()) return -1;
         if (m1.getRollNo() > m2.getRollNo()) return 1;
         else return 0;
   }
 }
 
 class SortByDept implements Comparator<Student>{
   public int compare(Student m1, Student m2)
     {
         return m1.getDept().compareTo(m2.getDept());
     }
 }
