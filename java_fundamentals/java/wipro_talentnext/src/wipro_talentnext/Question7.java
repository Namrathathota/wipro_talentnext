package wipro_talentnext;

import java.util.*;
public class Question7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n>0) {
			int digit = n%10;
			rev = rev*10+digit;
			n=n/10;
		}
		System.out.println(rev);
	}

}
