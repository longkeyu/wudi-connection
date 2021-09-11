package com.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
	public static void main(String []args) {
		Set set=new HashSet();
		set.add("Æ²Ö®À±");
		set.add(12);
		set.add(false);
		set.add(12);
		set.add(45.6);
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(obj+"");
		}
	}
}
