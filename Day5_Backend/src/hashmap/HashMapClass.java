package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	public static void main(String[] args) {
		
		HashMap<String,Integer> marks = new HashMap<String,Integer>();
		
		marks.put("John", 66);
		marks.put("Oliver", 76);
		marks.put("Antony", 88);
		marks.put("David", 55);
		
//		Iterator<String> iterator = marks.keySet().iterator();
//		while (iterator.hasNext()) {
//			String str = iterator.next();
//			System.out.println(str + " ==> " + marks.get(str));
//		}
		
		Set<Entry<String,Integer>> entrySet = marks.entrySet();
		
		for (Entry<String,Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " ===> " + entry.getValue());
		}
	}
}