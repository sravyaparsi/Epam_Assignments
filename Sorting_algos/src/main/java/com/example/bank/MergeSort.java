package com.example.bank;
import java.util.*;

/**
 * Hello world!
 *
 */
public class MergeSort 
{
    public static void main( String[] args )
    {
        	// your code goes her
	    CreateArray ca=new CreateArray();
        ArrayList<Integer> a ;
        a=ca.create();
        Sort1 s=new Sort1();
        s.mergesort(a,0,a.size()-1);
        for(int i=0;i<a.size();i++)
        	System.out.println(a.get(i));
    }
}
    class Sort1{
	public void mergesort(ArrayList<Integer> a,int low,int high){
		int mid;
		if(low < high){
			mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
    }
        public void merge(ArrayList<Integer> a, int low,int mid,int high){
         int i;
         //int extra_array[]=new int[high-low+1];
            ArrayList<Integer> extra_array=new ArrayList<Integer>(high-low-1);
            int m=high,k=0,n=mid,j;
            for(i=low,j=mid+1;i<=mid&&j<=high;){
                if(a.get(i)>a.get(j))
                    extra_array.add(k++,a.get(j++));
                else
                       extra_array.add(k++,a.get(i++));

            }
            while(j<=m)
                extra_array.add(k++,a.get(j++));
            while(i<=mid)
                extra_array.add(k++,a.get(i++));
            //a.addAll(extra_array);
            for(i=low;i<=high;i++)
                a.set(i,extra_array.get(i-low));
        }
	}



