import java.util.Scanner;
public class Time{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int c;
	
	System.out.print ("�� �Է� : ");
	c= scan.nextInt();
	int s=c%60;
	int h=c/3600;
	int m=(c-h*3600-s)/60;	//int m = c / 60-(hour*60);
	System.out.println(c+"�ʴ� "+h+"�ð� "+m+"�� "+s+"���Դϴ�." );
	}
}