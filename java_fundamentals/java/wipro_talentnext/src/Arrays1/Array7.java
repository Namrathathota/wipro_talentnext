package Arrays1;
import java.util.*;
public class Array7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Ascii values");
		int n= sc.nextInt();
		int[] asciiValues = new int[n];
		for(int i=0;i<n;i++) {
			asciiValues[i]=sc.nextInt();
		}
		for(int value:asciiValues) {
			System.out.print((char)value);
		}
		
	}

}
