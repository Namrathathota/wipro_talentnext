package Arrays1;
import java.util.*;
public class Array6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		HashSet<Integer>set = new HashSet<>();
		for(int num:arr) {
			if(!set.contains(arr)) {
				set.add(num);
			}
		}
		List<Integer>list = new ArrayList<>(set);
		Collections.sort(list);
		System.out.print("{");
		for(int num:list){
		    System.out.print(num+" ");
		}
		System.out.println("}");
	}

}
