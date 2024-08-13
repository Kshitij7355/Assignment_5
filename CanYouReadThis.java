package assignment_5;

import java.util.Scanner;

public class CanYouReadThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		Camel(s1);
	}
	public static void Camel(String s1) {
		 String ans ="";
		 ans = ans+s1.charAt(0);
		 for(int i =1;i<s1.length();i++) {
			 char ch = s1.charAt(i);
			 if(ch>='A' && ch<='Z') {
				 System.out.println(ans);
				 ans ="";
				 ans = ans+ch;
			 }
			 else {
				 ans = ans+ch;
			 }
		 }
		 System.out.println(ans);
			
	}
}

