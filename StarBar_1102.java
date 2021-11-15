import java.util.Scanner;

public class StarBar_1102 {


	public static void main(String[] args) {
		int max = 0;
		int min = 100;
		int cnt = 0;
		int[] a = new int [5];
		Scanner scan = new Scanner (System.in);
		
		int jumsu=0;
		System.out.print("점수 입력 : ");
		while(jumsu>=0 && jumsu<=100) {
			jumsu = scan.nextInt();
			
			if(max<jumsu && jumsu<=100) max = jumsu;
			if(min>jumsu && jumsu>=0) min = jumsu;
			
			if(jumsu/10==10) a[0]++;
			switch(jumsu/10) {
				case 9 :
					a[0]++; break;
				case 8 :
					a[1]++; break;
				case 7 :
					a[2]++; break;
				case 6 : 
					a[3]++; break;
				default :
					a[4]++; break;
			}
			
		}
		
		for(int i=0; i<a.length; i++) {
		
			switch(i) {
				case 0 :
					System.out.print("90점 이상 : "); break;
				case 1 :
						System.out.print("80점 대 : "); break;
				case 2 :
						System.out.print("70점 대 : "); break;
				case 3 :
						System.out.print("60점 대 : "); break;
				default : 
						System.out.print("60점 미만 : "); break;
			}
				
			for(int j=0; j<a[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
		
	}
}