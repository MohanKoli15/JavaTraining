package com.yash.collections;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author mohan.koli
 * Design the Binary Search application.
 *
 */
public class BinarySearch {
public static void main(String args[]) {
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(3);
        al.add(40);
        
        int search=Collections.binarySearch(al, 20);
        if(search!=-1)
            System.out.println("Element present at Index "+(search));
        else
            System.out.println("Element not present in the given list");
        
        
        
    }
}
