public class For_Test3 {
	public static void main(String args[]) {
		double sum=0;
		double sum2=0;
		for(int i=1; i<=100; i++) {
			if(i!=1 && i!=100) {
				System.out.print("(1/"+i+")+" );
				sum2=1/(double)i;
			}
			else if(i==1){
				System.out.print(1+"+");
			}
			else {
				System.out.print("(1/"+i+")=");
				sum2=1/(double)i;
			}
			sum+=sum2;
		}
		sum+=1;
		System.out.print(sum);
	}
}