import java.util.Scanner;
public class Gcd {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ù��° �� �Է� : ");
		int su1=scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		int su2=scan.nextInt();
		Max(su1, su2);
	}
	static void Max(int s1, int s2) {
		int i=1;
		int num=0;
		int small = (s1<s2) ? s1 : s2 ;	//s1�� s2���� ������
		int big = (s1>s2) ? s1 : s2 ;	//s1�� s2���� Ŭ��
		do {
			if(num!=0){
				if(num<small) {		//su1
					big=small; System.out.print("b"+big);
					small=num; System.out.print("s"+small);
				
				}
				else {		//1�����̻� big ���� 1�� ���ٲ�
					big=num;
				}
			}
			num=big-small;
		}while(small!=num);
		System.out.print("�ִ����� : "+num);
	}
}

// if�� �ݺ��� �ȿ� �־��ֱ�, �ڵ� ��ġ��