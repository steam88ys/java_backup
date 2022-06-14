package prepare;

import java.io.*;
import java.util.*;

public class sungDataExam {

	int length;
	String[] num = new String[10]; 
	String[] name = new String[10];
	int[] kor = new int[10];
	int[] eng = new int[10];
	int[] math = new int[10];
	int[] total = new int [10];
	int[] avg = new int[10];
	String[] hakzum = new String[10];
	int[] score = new int [10];
	
	public void writingData(String fname) throws IOException {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(new File(fname));
			bw = new BufferedWriter(fw);
			
			String[] n = {"학번", "이름", "국어", "영어", "수학", "총점", "평균", "학점", "등수"};
			for(int k = 0; k<9; k++) {
				bw.write(n[k]+"\t");
			}
			bw.newLine();
			bw.write("====================================================================");
			bw.newLine();
			
			for(int j = 0; j< length; j++) {
				
				bw.write(num[j] + "\t" + name[j] + "\t" + kor[j] + "\t" + eng[j] +"\t" + math[j] 
						+ "\t" + total[j] + "\t" + avg[j]+"\t" + hakzum[j]+"\t" + score[j]);
				bw.newLine();
			}
			
			bw.close(); // 파일을 닫을때는 객체생성의 역순으로 한다. 
			fw.close();
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
		
	}
	
	public void readingData(String fname) throws IOException {
		// String fname = "C:/Temp/writed.txt"
		// 배열에 파일으로 부터 읽어들인 데이터를 저장한다.
		try {
			String csvStr = "";
			String tmpStr = "";
			FileReader fr = new FileReader(new File(fname));
			BufferedReader br = new BufferedReader(fr);
	
			do {
				tmpStr = br.readLine();
				if (tmpStr != null) {
					csvStr += tmpStr + "\t";
				}
			} while (tmpStr != null);
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			length = parse.countTokens() / 5;
			
			for (int i = 0; i < length ; i++) {
				num[i] = parse.nextToken();
				name[i] = parse.nextToken();
				kor[i] = Integer.valueOf(parse.nextToken()).intValue();
				eng[i] = Integer.valueOf(parse.nextToken()).intValue();
				math[i] = Integer.valueOf(parse.nextToken()).intValue();
				total[i] = kor[i] + eng[i] + math[i];
				avg[i] = total[i] / 3;
			
				if(avg[i]<=100 && avg[i]>=90) hakzum[i] = "A";
				else if(avg[i]>=80) hakzum[i] = "B";
				else if(avg[i]>=70) hakzum[i] = "C";
				else if(avg[i]>=60) hakzum[i] = "D";
				else hakzum[i] = "F";
			}
			
			for(int i = 0; i<length; i++) {
				int cnt=1;
				
				for(int k = 0; k<length; k++) {
					if(avg[i]<avg[k]) {
						score[i] = cnt++;
					}
				}
				score[i]+=1;
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("잘못된 파일 이름을 입력했습니다");
		}
	}
}
