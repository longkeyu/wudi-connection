package com.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
	public static void main(String [] args) {
		Map map=new HashMap();
		map.put("Ʋ֮��","hard");
		map.put("yjj","12");
		map.put("����", 34.5);
		map.put("د", false);
		map.put("ת��",12);
		Object a=map.get("Ʋ֮��");
		System.out.println("a="+a);
		Collection col=map.values();
		Iterator it =col.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(col);
		}
	}
}
