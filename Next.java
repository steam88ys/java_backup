import java.util.Scanner;
public class Next{
	public static void main(String args[]) {
		final int a =10;
		a=15;
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		//String str=sc.next();   //���ڿ� �Է� ��ū
		String str=sc.nextLine();  //���ڿ� �Է� ����
		System.out.println(str);
	}
}