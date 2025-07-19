package wipro_talentnext;

import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("The Number is positive");
		}else if(a<0) {
			System.out.println("The Number is Negative");
		}else {
			System.out.println("Zero");
		}
	}

}
