package Array;

import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][]score = new int[5][3];
		int[]n = new int[5];
		String[]sub_title = {"완성도", "창의성", "이해도"};
		int max=0;
		int cnt=0;
		
		//입력
		for(int i=0; i<score.length; i++) {
			System.out.println("<"+(i+1)+"번째 조 입력>");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j]=scan.nextInt();
				if(score[i][j]<0 || score[i][j]>20) j--;
			}
		}
		
		//가장큰 조점수 구하기
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				n[i]+=score[i][j];
				if(max < n[i])
					max=n[i];
			}
		}
		for(int i=0; i<5; i++) {
			cnt++;
			if(max==n[i]) break;
		}
		
		//순위
		int[]rank = new int[score.length];
		for(int i=0;i<score.length;i++)
			rank[i]=1;
		for(int i=0;i<score.length-1;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(n[i] < n[j]) rank[i]++;
				else if(n[i] > n[j]) rank[j]++;
			}
		}
		
		//출력
		System.out.println("==============================================");
		for(int i=0; i<sub_title.length;i++)
			System.out.print("\t"+sub_title[i]);
		System.out.println("\t합계\t순위");
		System.out.println("==============================================");
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+"조 : ");
			for(int j=0; j<score[i].length; j++) {
				System.out.print("\t  "+score[i][j]);
			}
			System.out.println("\t "+n[i]+"\t "+rank[i]);
		}
		System.out.println("==============================================");
		System.out.println("최고팀 : "+cnt+"번째 팀 -> 점수 : "+max);
	}

}

/*
package Array;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int max[]=new int[5];
		int win=0, hap=0;
		String [] sub_title = {"완성도", "창의성", "이해도"};
		int [][]a=new int [5][3];
		for(int i=0; i<a.length; i++) {
			hap=0;
			System.out.println("<"+(i+1)+"조 입력>");
			
			for(int j=0; j<a[i].length; j++) {
				while(true) {
					System.out.print(sub_title[j]+": ");
					a[i][j]=scan.nextInt();
					if(a[i][j]>=0 && a[i][j]<=20) {		// (a[i][j]<0 || a[i][j]>20) j--;로 바꿀 수 있음
						break;
					}	
				}
				max[i]=a[i][j];
			}
			if(max[i]>hap) {
				hap=max[i];
				win=(i+1);
			}
		}
		int rank[]= new int[a.length];
		for(int i=0; i<a.length; i++)
			rank[i]=1;
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; i<a.length; j++) {
				if (max[i]<max[j]) rank[i]++;
				else if (max[i]>max[j]) rank[j]++;
			}
		}
		
		// 출력
		System.out.println("===================================");
		for(int i=0; i<sub_title.length; i++) {
			System.out.print("\t"+sub_title[i]);
		}
		System.out.println("\t합계");
		System.out.println("===================================");
		for(int i=0; i<a.length; i++) {
			System.out.print((i+1)+"조 : \t");
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println(max[i]+"\t"+rank[i]);
		}
		System.out.println("===================================");
		
		for(int i=0; i<a.length; i++) {
			System.out.println("최고팀 : "+win+"번째 팀  ->  점수 : "+max[i]+" 순위 : "+rank[i]);
		}
		
		
	}

}

// 입력, 출력, 처리로 구성바꾸기
// 점수 배열 사용해서 바꿔야 함
// 하나씩 숫자 비교해서 작을때마다 순위 1씩 증가시키기 ->  이중for문 사용하기

*/
