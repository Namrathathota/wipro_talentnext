package wipro_talentnext;
import java.util.*;
public class Question17 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        HashMap<Integer,String>map = new HashMap<>();
	        int n = sc.nextInt();
	        if(n>12){
	            System.out.println("Invalid");
	        }
	        map.put(1,"January");
	        map.put(2,"February");
	        map.put(3,"March");
	        map.put(4,"April");
	        map.put(5,"May");
	        map.put(6,"June");
	        map.put(7,"July");
	        map.put(8,"August");
	        map.put(9,"September");
	        map.put(10,"October");
	        map.put(11,"November");
	        map.put(12,"December");
	        System.out.println(map.get(n));
	}

}
