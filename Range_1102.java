import java.util.Scanner;

public class Range_1102 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		// 입력
		int[] in = new int[100];
		int index=0;
		int sum=0;
		while(true) {
			System.out.print("수 입력 : ");
			int su = scan.nextInt();
			if(su>=10 && su<=30) {
				in[index++]=su;
				sum+=su;
			}
			else if(su==0) break;
		}	
		
		// 출력
		System.out.print("10 ~ 30 사이의 수 : ");
		for(int i=0; i<index; i++) {
			System.out.print(in[i]+" ");
		}
		System.out.println();
		System.out.println("총합 : "+sum);
		
	}

}
