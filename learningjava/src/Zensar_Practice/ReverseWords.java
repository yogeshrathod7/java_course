package Zensar_Practice;

import java.util.Scanner;

public class ReverseWords {
	public static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		
		for (int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') continue;
			int start=i;
			while (i<s.length()&& s.charAt(i)!=' ') i++;
			if(result.length()==0)
				result.insert(0, s.substring(start,i));
			else 
				result.insert(0," ").insert(0, s.substring(start, i));
			
		}
		return result.toString();
	}
public static void main(String[] args) {
	ReverseWords rv = new ReverseWords();
	Scanner sc = new Scanner(System.in);
	String s =sc.nextLine();
	sc.reverseWords(s);
	
}
 

}
