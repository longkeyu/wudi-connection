package com.list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	public static void main(String []args) {
		List lst=new ArrayList();
		lst.add("hello");
		lst.add(33);
		lst.add(33.3);
		lst.add(true);
		lst.add(33);
		int a =lst.lastIndexOf(33);
		System.out.println("a="+a);
		for(int i=0;i<lst.size();i++) {
			Object obj=lst.get(i);
			System.out.println(obj+"");
		}
	}
}
