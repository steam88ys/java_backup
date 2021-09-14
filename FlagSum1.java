import java.util.Scanner;
public class FlagSum1{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		int sum2=1;
		for(int i=1; i<=n; i++){
			if(i%2==0) {
				sum2=-1;
				System.out.print(" - "+i);
			}
			else if(i==1) {
				sum2=1;
				System.out.print(i);
			}
			else {
				sum2=1;
				System.out.print(" + "+i);
			}
			sum+=i*sum2;
		}
		System.out.print(" = "+sum);
	}
}