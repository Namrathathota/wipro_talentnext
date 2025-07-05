package wipro_talentnext;

import java.util.Scanner;
public class Question12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c>='A' && c<='Z' || c>='a' && c<='z') {
				System.out.println("Alphabet");
			}else if(c>='0' && c<='9') {
				System.out.println("Number");
			}else {
				System.out.println("Special symbol");
			}
		}
	}
}
