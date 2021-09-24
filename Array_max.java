package Array;

import java.util.Scanner;

public class Array_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int [] score=new int[10];
		for (int i=0; i<score.length; i++) {
			score[i]=scan.nextInt();
		}
		
		int max=score[0];
		for(int i=1; i<score.length; i++) {
			if(max<score[i]) max=score[i];
		}
		System.out.print(max);
		
	}

}
