package Array;

import java.util.Scanner;

public class Array_Sort_Method {

public static void main(String[] args) {
		
		int [] a = new int [5];
		int [] b = new int [5];
		int [] c = new int [10];
		
		int x=0, y=0, z=0;			
		Scanner scan= new Scanner (System.in);
		
		System.out.print("첫번째 배열 입력 : ");			// a 입력
		for(int i=0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		
		sort(a);
		
		System.out.print("정렬 >>");
		for(int i=0; i<a.length; i++) {				// a출력
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
		
		System.out.print("두번째 배열 입력 : ");			// b 입력
		for(int i=0; i < b.length; i++) {
			b[i] = scan.nextInt();
		}
		
		sort(b);
		
		System.out.print("정렬 >>");
		for(int i=0; i<b.length; i++) {				// b출력
			System.out.print(" "+b[i]);
		}
		System.out.println();
		
		
		while(true) {								// Merge한 부분 (a와 b 병합)
			if(a[x]<b[y]) {
				c[z]=a[x];
				x++;
				z++;
			}
			else if(a[x]>b[y]) {
				c[z]=b[y];
				y++;
				z++;
			}
			else {
				c[z]=a[x];
				x++;
				y++;
				z++;
			}
			
			if(x==a.length || y==b.length) {		// 배열 a, b중 하나가 끝나면 멈춤
				break;
			}
			
		}
							
		if(x==a.length) {							// a정렬 다 끝났을 때 남은 수 쭉 출력
			
			for(int i=y; i<b.length; i++) {
				c[z] = b[i];
				z++;
			}
		}
		else {										// b정렬 다 끝났을 때 남은 수 쭉 출력
			
			for(int i=x; i<a.length; i++) {
				c[z] = a[i];
				z++;
			}
		}
		
		System.out.print("두 배열 정렬 >>");
		for(int i=0; i<c.length && c[i] != 0 ; i++) {				// c 출력
			System.out.print(" "+c[i]);
		}
		
	}
	static void sort(int[] arr) {									// a, b정렬 메서드 public static이라 static이어야 함
		int temp=0;
		for(int i=0; i<arr.length-1; i++) {				
			for(int j=(i+1); j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

}
