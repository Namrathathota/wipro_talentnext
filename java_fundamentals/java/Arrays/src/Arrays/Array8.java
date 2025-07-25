package Arrays;
import java.util.*;
public class Array8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		boolean skip = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==6) {
				skip=true;
			}
			if(!skip) {
				sum+=arr[i];
			}
			if(arr[i]==7) {
				skip=true;
			}
		}
		System.out.println(sum);
	}
}
	

