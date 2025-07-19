package wipro_talentnext;

import java.util.*;
public class Question18 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			char c = sc.next().charAt(0);
			Map<Character,String>map = new HashMap<>();
			map.put('R', "Red");
			map.put('B',"Blue");
			map.put('G', "Green");
			map.put('O', "Orange");
			map.put('W', "White");	
		
		if(map.containsKey(c)) {
			System.out.println(map.get(c));
		}else {
			System.out.println("Invalid");
		}
	}
}
