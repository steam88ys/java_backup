package Array;

public class ArrayExam12 {

	public static void main(String[] args) {
		System.out.println("---------자바실행---------");
		int k=1;
		int [][]a=new int [7][10];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j]=k++;		// i * a[i].length + (j+1)
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
