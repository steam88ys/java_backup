package Array;

public class ArrayExam13 {

	public static void main(String[] args) {
		System.out.println("---------자바실행---------");
		int k=1;
		int [][]a=new int [4][4];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=i; j++) {
				a[i][j]=k++;		// i * a[i].length + (j+1)
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<=i; j++) {			// 1행에 1개 출력, 2행에 2개 출력
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
