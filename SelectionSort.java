package Array;

import java.util.Scanner;

public class SelectionSort {

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
		
		for(int i=0; i<data.length; i++) {
			for(int j=(i+1); j<data.length; j++) {
				if(data[i]>data[j]) {
					temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+"\t");
		}
		
	}

}
