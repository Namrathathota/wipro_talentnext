package wipro_talentnext;

import java.util.Scanner;
public class Question5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("even");
		}else {
			System.out.println("Odd");
		}
	}
}
