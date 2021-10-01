package Array;

public class ArrayExam {

	public static void main(String[] args) {
		// int [][] a = {{1, 2, 10}, {10, 20, 30}};
		int [][] a = new int[3][]; a[0]= new int[3]; a[1]= new int[2];
		for(int i=0; i<a.length; i++) {
			if(i==1) System.out.println();
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
		}

	}

}
