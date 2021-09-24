package Array;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("데이터 개수 입력 : ");
		int a_su=scan.nextInt();
		
		int [] data = new int [a_su];
		
		for(int i=0; i<data.length; i++) {
			data[i]=scan.nextInt();
		}
		
		for(int i=0; i<data.length; i++)  {
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		
		int temp=0;	// 빈공간에 변수가 나오면 사라져서 중간 저장하는 공간
		
		for(int i=(data.length-2); i>=0; i--) {
			for(int j=0; j<=i; j++)
				if(data[j]>data[j+1]) {
					temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
			}
			
		}
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+"\t");
		}
		
	}

}
