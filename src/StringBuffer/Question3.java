package StringBuffer;
import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String newString = word.substring(1,word.length()-1);
		System.out.println(newString);
	}
}