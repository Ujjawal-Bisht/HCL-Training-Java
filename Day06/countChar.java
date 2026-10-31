package Day06;

import java.util.*;

public class countChar {
	public static long countVowel(String[] s) {
		long cnt = 0; 
		List<String> lst = Arrays.asList(s) ;
		cnt = lst.stream().filter(x -> x.contains("A") || x.contains("E") || x.contains("I") || x.contains("U") || x.contains("O") || x.contains("a") || x.contains("e") || x.contains("i") || x.contains("o") || x.contains("u")).count();
		return cnt ;
	}
	
	public static void main(String[] args) {
		String[] s = {"Ujjawal", "Mohit"} ;
		System.out.println("Number of vowels are: "+ countVowel(s));
		
		ArrayList<Integer> a = new ArrayList<Integer>();
	}
}
