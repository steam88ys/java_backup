import java.util.Scanner;
public class Four_op_1102 {
		public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.print("�̸��� �Է��ϼ���.");
		name=scan.nextLine( );

		System.out.print("������ �Է��ϼ���.");
		int a;
		a=scan.nextInt( );
		
		System.out.print("�Ǽ��� �Է��ϼ���.");
		double b;
		b=scan.nextDouble( );
		
		System.out.println(a+" + "+b+"  = "+(a+b) ) ;
		System.out.println(a+" - "+b+"  = "+(a-b) ) ;		
		System.out.println(a+" * "+b+"  = "+(a*b) ) ;
		System.out.println(a+" / "+b+"  = "+(a/b) ) ;
		
	}
}