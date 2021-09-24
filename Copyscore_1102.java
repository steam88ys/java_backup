package Array;

import java.util.Scanner;

public class Copyscore_1102 {

		public static void main(String args[]){
			String [] sub_name = {"국어", "영어", "수학", "자바", "C"};	
			Scanner scan=new Scanner(System.in);
			
			String num, Sname; //학번, 이름
			int kor, eng, math, java; //과목
			int [] subj  = new int [sub_name.length+1] ; // 총점 방을 위해 하나 늘림
			
			System.out.print("학번 : ");
			num=scan.next();
			System.out.print("이름 : ");
			Sname=scan.next();
			
			for (int i=0; i<subj.length-1; i++ ) {
				System.out.print(sub_name[i]+" 점수 : ");
				subj[i]=scan.nextInt();
				while(!(subj[i]<0 && subj[i]>100)) {
					if(subj[i]>0 && subj[i]<=100) break;
					System.out.print("다시입력 : ");
					subj[i]=scan.nextInt();
				}
			}
			
			for(int i=0; i<subj.length-1; i++) {
				subj[subj.length-1]+=subj[i];
				
			}
			
			double average=(double)(subj[subj.length-1])/(subj.length-1);  //평균

			System.out.println("\n합계 : "+subj[subj.length-1]);
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



