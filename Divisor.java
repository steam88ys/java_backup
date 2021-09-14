import java.util.Scanner;
public class Divisor{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int su=scan.nextInt();
		int i=1;
		do{
			if(su%i==0) System.out.print(i+" ");	
			i++;
		}while(i<=su);
	}
}