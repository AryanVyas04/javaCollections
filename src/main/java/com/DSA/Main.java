package com.DSA;

import java.util.ArrayList;
import java.util.List;

//My first commit
//working on local branch
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        arrayList Arraylist = new arrayList();
        Arraylist.list1.add(1);
        System.out.println(Arraylist.list1.get(0));

        //Adding elemenets in arraylist
        List<Integer> addtoList = new ArrayList<>();
        addtoList.add(1);  // add directly
        addtoList.add(2);
        addtoList.add(3);
        addtoList.add(4);

        //Accessing elements of arrayList
        for(int i=0 ;i<addtoList.size();i++)
        {
            System.out.println(addtoList.get(i));
        }
    }
}