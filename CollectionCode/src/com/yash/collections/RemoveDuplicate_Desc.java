package com.yash.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * 
 * @author mohan.koli
 * Remove the string duplicate and print the string result ascending and descending order.
 *
 */

public class RemoveDuplicate_Desc {
	public static void main(String[] agrs) {
        // store elements in List
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("d");
        list.add("b");
        list.add("b");
        list.add("d");
        list.add("c");



       for (String a : list) {
            System.out.println(a);
        }
        // remove all duplicates value
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (int i = 0; i <= list.size(); i++) {
            set.addAll(list);
        }
        System.out.println("after removing duplicate " + set);

       // Ascending order
        Set<String> sorted = new TreeSet<String>();
        for (int j = 0; j <= set.size(); j++) {
            sorted.addAll(set);
        }
        System.out.println("ascending order " + sorted);



       // Descending order
        TreeSet<String> s1 = (TreeSet<String>) ((TreeSet<String>) sorted).descendingSet();
        System.out.println("desending order " + s1);
    }

}
