package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program3 {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}