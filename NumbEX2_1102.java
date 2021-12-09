// 1102 김윤서
package EXAM2;

class Numb {
	int su1;
	int su2;
	
	public Numb(int i, int j) {
		su1 = i;
		su2 = j;
	}
	int bigNumber(int s1, int s2) {
		if(s1>s2) return s1;
		else return s2;
	}
	int smallNumber(int s1, int s2) {
		if(s1>s2) return s2;
		else return s1;
	}
	
}

public class NumbEX2_1102 {

	public static void main(String[] args) {

		int su1 = (int)((Math.random()*100)+1), su2 = (int)((Math.random()*100)+1);
		Numb n1 = new Numb(su1, su2);
		System.out.println(su1+", "+su2+" 중 큰 수는 "+n1.bigNumber(su1, su2));
		System.out.println(su1+", "+su2+" 중 작은 수는 "+n1.smallNumber(su1, su2));
		
		
	}

}
