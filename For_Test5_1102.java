public class For_Test5_1102 {
	public static void main(String args[]) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i==10)	System.out.print("("+i+"*"+i+") = ");
			else if(i!=1)	System.out.print("("+i+"*"+i+") + ");
			else	System.out.print(i+" + ");
			sum+=(i*i);
		}
		System.out.print(sum);
	}
}