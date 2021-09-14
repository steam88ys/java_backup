import java.util.Scanner;
public class For_Test8_1102 {
	public static void main(String args[]) {
		int cnt=0;
		int mulnum;
		Scanner scan=new Scanner(System.in);
		int mynum=scan.nextInt();
		for(int j=1; j<=100; j++) {
			mulnum=mynum*j;
			if(mulnum<=100)	{
				System.out.print(mulnum+"  ");
				cnt++;
			}
			else  break;
			
		}
		System.out.println();
		System.out.print("°³¼ö = "+cnt+"°³");
	}
}