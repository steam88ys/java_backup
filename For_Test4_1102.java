import java.util.Scanner;
public class For_Test4_1102{
	public static void main(String args[]) {
		double sum=0;
		Scanner scan=new Scanner(System.in);
		double n=scan.nextInt();
		for(int i=1; i<=n; i++) {
			if(i==1) 		System.out.print(i+" + ");		
			else if (i==n)	System.out.print("(1/"+i+") = ");	
			else 		System.out.print("(1/"+i+") + ");
			sum+=((double)1/i);	
		}
		System.out.print(sum);
	}
}