import java.util.Scanner;
public class Four_op_1102 {
		public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.print("이름을 입력하세요.");
		name=scan.nextLine( );

		System.out.print("정수를 입력하세요.");
		int a;
		a=scan.nextInt( );
		
		System.out.print("실수를 입력하세요.");
		double b;
		b=scan.nextDouble( );
		
		System.out.println(a+" + "+b+"  = "+(a+b) ) ;
		System.out.println(a+" - "+b+"  = "+(a-b) ) ;		
		System.out.println(a+" * "+b+"  = "+(a*b) ) ;
		System.out.println(a+" / "+b+"  = "+(a/b) ) ;
		
	}
}