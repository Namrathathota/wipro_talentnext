package Arrays;
import java.util.*;
public class Array1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		int avg = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			avg=sum/arr.length;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);
	}
}
