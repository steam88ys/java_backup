import java.util.Scanner;
public class Time{
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int c;
	
	System.out.print ("초 입력 : ");
	c= scan.nextInt();
	int s=c%60;
	int h=c/3600;
	int m=(c-h*3600-s)/60;	//int m = c / 60-(hour*60);
	System.out.println(c+"초는 "+h+"시간 "+m+"분 "+s+"초입니다." );
	}
}