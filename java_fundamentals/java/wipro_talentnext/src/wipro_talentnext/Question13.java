package wipro_talentnext;

public class Question13 {
	public static void main(String[] args) {
		for(int num=10;num<=99;num++) {
			boolean isPrime = true;
			if(num<=1) {
				isPrime=false;
			}else {
				for(int i=2;i<=Math.sqrt(num);i++) {
					if(num%i==0) {
						isPrime = false;
					}
				}
			}
			if(isPrime) {
				System.out.print(num+" ");
			}
		}
	}

}
