package com.example.bank;

import java.util.*;



class CreateArray{
    public ArrayList<Integer> create(){
        ArrayList<Integer> ar = new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int number=sc.nextInt();
            ar.add(number);
          
        }
        return(ar);
    }
}