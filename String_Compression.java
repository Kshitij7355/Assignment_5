package assignment_5;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String s1 = s.next();
		String_Compare(s1);

	}
	public static void String_Compare(String str) {
		int count =0;
		char ch = str.charAt(0);
		for(int i =0; i<str.length();i++) {
			int curr = str.charAt(i);
			if(curr==ch) {
				count++;
			}
			else {
				System.out.print(ch+""+count);
				ch = str.charAt(i);
				count=1;
			}
			
	   }
		System.out.print(str.charAt(str.length()-1)+""+count);
		    
    }
}
