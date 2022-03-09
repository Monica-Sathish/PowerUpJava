package collections_oops;

import java.util.*;

public class maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length: ");
		int n = in.nextInt();
		Map <Integer,String> m1 = new HashMap <Integer, String>();
		for(int i=0;i<n;i++) {
			int val = in.nextInt();
			String glitch = in.nextLine();
			String name = in.nextLine();
			m1.put(val, name);
		}
		System.out.println("The map contains "+m1);
		//no duplicate keys
		System.out.println("The key and value will be saved if given key is not present");
		m1.putIfAbsent(6, "Maha");
		System.out.println("The map contains "+m1);
		m1.putIfAbsent(4, "Maha");
		m1.putIfAbsent(7, "Maha");
		System.out.println("The map contains "+m1);
		System.out.println("Enter the value to search");
		String str = in.nextLine();
		if(m1.containsValue(str)) {
			System.out.println("It's present");
		}else {
			System.out.println("It's not present");
		}
		System.out.println("Enter the key to search");
		int find = in.nextInt();
		if(m1.containsKey(find)) {
			System.out.println("It's present and the value is "+m1.get(find));
		}else {
			System.out.println("It's not present");
		}
		System.out.println(m1);
		m1.remove(7);
		System.out.println("After removal of pair using KEY "+m1);
		m1.remove(6,"Maha");
		System.out.println("After removal of pair using KEY and VALUE "+m1);
		m1.replace(4,"joy");
		System.out.println("After Replacing the value in key 4: "+m1);
		m1.replace(4, "joy","Enjoy"); //map.replace(key, old value, new value)
		System.out.println("After replacing old value to new value: "+m1);
		System.out.println("Size: "+m1.size());
		System.out.println("Empty? : "+m1.isEmpty());
		System.out.println("Clear all in map");
		m1.clear();
		System.out.println("Empty? : "+m1.isEmpty());
		System.out.println("******************************************************************************");
		System.out.println("Iterating Over a KEYSET()");
		Map <Integer, String> m2 = new LinkedHashMap <Integer, String>();
		m2.put(1, "abc");
		m2.put(2, "def");
		m2.put(3, "ghi");
		m2.put(4, "jkl");
		m2.put(5, "mno");
		m2.put(6, "pqr");
		m2.put(7, "stu");
		m2.put(8, "xyz");
		m2.put(9, "abc");
		Set <Integer> s1 = m2.keySet();
		Iterator <Integer> it = s1.iterator();
		while(it.hasNext()) {
			int num = it.next();
			String str1 = m2.get(num);
			System.out.println("The key value is "+num+" and the value is "+str1);
		}
		System.out.println("******************************************************************************");
		System.out.println("Iterating Over a MAP VALUES");
		Collection <String> c1 = m2.values();
		System.out.println("The VALUES are:");
		for(String s: c1) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("******************************************************************************");
		System.out.println("Iterating Over a ENTRYSET()");
		Set<Map.Entry<Integer, String>> var1 = m2.entrySet();
		for(Map.Entry<Integer, String> var2 : var1) {
			int var3 = var2.getKey();
			String var4 = var2.getValue();
			System.out.println("The key value is "+var3+" and the value is "+var4);
		}
	}
}
