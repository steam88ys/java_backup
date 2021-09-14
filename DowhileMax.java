import java.util.Scanner;
public class DowhileMax{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int num ,max=0;
		do {
			num=scan.nextInt();
			if(num>max) max=num;
			
		} while(num!=0);
		System.out.print("�ִ밪 : "+max);
	}
}