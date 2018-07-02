package com.example.bank;

import java.util.*;

/**
 * Hello world!
 *
 */
public class BubbleSort
{
    public static void main( String[] args )
    {
        	// your code goes her
       	Sort s=new Sort();
	    CreateArray ca=new CreateArray();
         ArrayList<Integer> arr ;
        arr=ca.create();
        s.bubblesort(arr,arr.size());
        for(int i=0;i<arr.size();i++)
        	System.out.println(arr.get(i));
    }
}


 class Sort{
	public void bubblesort(ArrayList<Integer> arr,int last_index){
        int temp;
		for(int i=0;i<last_index-1;i++){
            for(int j=0;j<last_index-i-1;j++){
                if(arr.get(j+1)<arr.get(j)){
                    temp=arr.get(j+1);
                    arr.set(j+1,arr.get(j) );
                    arr.set(j,temp );
                }
            }
        }
	}
    }
    

