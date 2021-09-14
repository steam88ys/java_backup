package Array;

import java.util.Scanner;

public class Score_1102 {

		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			
			String num, Sname; //학번, 이름
			int kor, eng, math, java; //과목
			
			System.out.print("학번 : ");
			num=scan.next();

			System.out.print("이름 : ");
			Sname=scan.next();

			System.out.print("국어 : ");
			kor=scan.nextInt();
			while(!(kor<0 && kor>100)) {
				if(kor>=0 && kor<=100) break;
				kor=scan.nextInt();
			}

			System.out.print("영어 : ");
			eng=scan.nextInt();
			while(!(eng<0 && eng>100)) {
				if(eng>=0 && eng<=100) break;
				eng=scan.nextInt();
				
			}

			System.out.print("수학 : ");
			math=scan.nextInt();
			while(!(math<0 && math>100)) {
				if(math>=0 && math<=100) break;
				math=scan.nextInt();
				
			}

			System.out.print("자바 : ");
			java=scan.nextInt();
			while(!(java<0 && java>100)) {
				if(java>=0 && java<=100) break;
				java=scan.nextInt();
				
			}
			
			int total=kor+eng+math+java;
			double average=(double)(total)/4;  //평균

			System.out.println("\n합계 : "+total);
			System.out.println("평균 : "+average);
			System.out.print("평점 : ");
			
			
//			평균 A(90이상) B(80이상) C(70이상) D(60이상) E(나머지)	
			switch((int)average/10) {
				case 10:
				case 9: System.out.println("A"); break;
				case 8: System.out.println("B"); break;
				case 7: System.out.println("C"); break;
				case 6: System.out.println("D"); break;
				default: System.out.println("E");
			}
		}
	}



