public class EvenSum1to100 {
	public static void main(String args[]) {
		int sum=0;
		for(int i=2; i<=100; i++){
			if(i%2==0) {
				sum+=i;
				if(i==2) {
					 System.out.print(i);
				}
				else {
					System.out.print(" + "+i);
				}
			}
			
		}
		System.out.print(" = "+sum);
	}
}