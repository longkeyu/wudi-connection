package com.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test3 {
	public static void main(String [] args) {
		Map map=new HashMap();
		map.put("Æ²Ö®À±","hard");
		map.put("yjj","12");
		map.put("°¡¹þ", 34.5);
		map.put("Ø¯", false);
		map.put("×ª²¥",12);
		Object a=map.get("Æ²Ö®À±");
		System.out.println("a="+a);
		Collection col=map.values();
		Iterator it =col.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			System.out.println(col);
		}
	}
}
