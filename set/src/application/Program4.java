package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program4 {
	
	public static void main(String[] args) {
		
		Set<String> set = new LinkedHashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		
		for (String p : set) {
			System.out.println(p);
		}
	}
}