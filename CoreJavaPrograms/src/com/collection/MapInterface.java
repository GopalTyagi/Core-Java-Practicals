package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");
		System.out.println(m);

		System.out.println(m.get(3)); // it will return the value of key

		boolean b = m.containsKey(2); // it will return true if key is there
		System.out.println(b);

		boolean b1 = m.containsValue("four"); // it return true if value exist
		System.out.println(b1);

		Set keyval = m.entrySet();
		System.out.println(keyval);

		boolean b3= m.isEmpty();
		System.out.println(b3);

		System.out.println(m.keySet()); // it will retrun all keys

		System.out.println(m.values()); // it will return all values

		System.out.println(m.remove(4)); // it will remove

		System.out.println(m.size()); // return size
	}

}
