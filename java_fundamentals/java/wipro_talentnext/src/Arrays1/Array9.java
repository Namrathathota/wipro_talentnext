package Arrays1;
import java.util.*;
public class Array9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer>result=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				result.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result.add(arr[i]);
			}
		}
		System.out.println(result);
	}

}
