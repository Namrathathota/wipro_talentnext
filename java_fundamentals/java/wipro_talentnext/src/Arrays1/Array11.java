package Arrays1;
import java.util.*;
public class Array11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int[] newArr = new int[2];
		int middle1 = arr1[arr1.length/2];
		int middle2 = arr2[arr2.length/2];
		newArr[0] = middle1;
		newArr[1] = middle2;
		System.out.println(Arrays.toString(newArr));
	}
}
