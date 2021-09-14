public class Whilesum1to100 {
	public static void main(String args[]) {
		int i=1, sum=0;
		while(i<=100) {
			sum+=i;
			i++;
		}
		System.out.print("1부터 100사이의 합 : "+sum);
	}
}