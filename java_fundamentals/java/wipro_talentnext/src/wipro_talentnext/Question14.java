package wipro_talentnext;

import java.util.Scanner;
public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a prime");
		}
	}

}
