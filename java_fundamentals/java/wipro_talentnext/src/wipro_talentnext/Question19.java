package wipro_talentnext;

import java.util.Scanner;
public class Question19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		if(Character.isLetter(c)) {
			char upper = Character.toUpperCase(c);
			System.out.print(upper);
		}else {
			char Lower = Character.toLowerCase(c);
			System.out.print(Lower);
		}
	}

}
