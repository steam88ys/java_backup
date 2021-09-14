import java.util.Scanner;
public class FlagSum{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=1; i<=n; i++){
			if(i%2==0) {
				sum-=i;
				System.out.print(" - "+i);
			}
			else  {
				sum+=i;
				if(i==1) {
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