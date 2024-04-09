package com.mycollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SynchronizedCollection {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);

		Collection syn = Collections.synchronizedCollection(a);
		System.out.println(syn);
		// List l = Collections.synchronizedList(a);

		TreeSet t = new TreeSet();
		t.add(4);
		t.add(5);
		Set s = Collections.synchronizedSet(t);
		System.out.println(s);
		
		
		HashSet h = new HashSet();
		h.add(6);
		h.add(7);
		Set s1 = Collections.synchronizedSet(h);
		System.out.println(s1);
		
		
		HashMap map = new HashMap();
		map.put(1, "gopal");
		Map m = Collections.synchronizedMap(map);
		System.out.println(m);
		
		
		TreeMap tm = new TreeMap();
		tm.put(2, "krishna");
		Map mp = Collections.synchronizedMap(tm);
		System.out.println(mp);
	}

}
