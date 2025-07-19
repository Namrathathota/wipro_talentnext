package Arrays;
import java.util.*;
public class Array4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int largest1 = Integer.MIN_VALUE;
			int largest2=Integer.MIN_VALUE;
			int smallest1 = Integer.MAX_VALUE;
			int smallest2=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]>largest1) {
					largest2=largest1;
					largest1=arr[i];
				}else if(arr[i]>largest2) {
					largest2 = arr[i];
				}
				if(arr[i]<smallest1) {
					smallest2 = smallest1;
					smallest1 = arr[i];
				}else if(arr[i]<smallest2) {
					smallest2 = arr[i];
				}
			}
			System.out.println(largest1);
			System.out.println(largest2);
			System.out.println(smallest1);
			System.out.println(smallest2);
			
		}

	}


