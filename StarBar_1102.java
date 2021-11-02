import java.util.Scanner;

public class StarBar_1102 {


	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int cnt = 0;
		Scanner scan = new Scanner (System.in);
		
		int jumsu=0;
		System.out.print("점수 입력 : ");
		while(jumsu>=0 && jumsu<100) {
			min = jumsu;
			if(max<jumsu) max = jumsu;
			if(min>jumsu) min = jumsu;
			jumsu = scan.nextInt();
		}
		
		int[] a = new int [5];
		switch(jumsu/10) {
			case 9 :
				a[0]++;
			case 8 :
				a[1]++;
			case 7 :
				a[2]++;
			case 6 : 
				a[3]++;
			default :
				a[4]++;
		}
		
		// 2중 for문 사용해서 별 출력하기
		int su3=90;
		for(int i=0; i<a.length; i++) {
			System.out.print(su3+"점 ");
			su3-=10;
			if(su3/10==9) System.out.print("이상");
			else if(su3/10==8) System.out.print("대");
			else if(su3/10==7) System.out.print("대");
			else if(su3/10==6) System.out.print("대");
			else System.out.print("미만");
			
			
			for(int j=0; j<a[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
		
	}
}