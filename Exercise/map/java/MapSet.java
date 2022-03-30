package com.map.java;

import java.util.*;
import java.util.Map.Entry;

public class MapSet {
		public static void main(String[] args) {
			HashMap<String,Long> hello=new HashMap<>();
			hello.put("maddy",9629141633l);
			hello.put("niyaz",637373733l);
			Set<Entry<String, Long>> set1 = hello.entrySet(); 
			
			Iterator<Entry<String, Long>> iterator1 = set1.iterator();
			Set<String> keySet1 = hello.keySet();
			for (String string : keySet1) {
				System.out.println(string+"="+hello.get(string));
			}
			
			Iterator<String> iterator2 = keySet1.iterator();
			while(iterator2.hasNext())
			{
				System.out.println(iterator2.next());
			}
			System.out.println("=========");
			while(iterator1.hasNext())
			{
				System.out.println(iterator1.next());
			}
			
		}
}
