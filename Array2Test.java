package test.arr2;

public class Array2Test {

	public static void main(String[] args) {

		String[][] favs = {{"��", "������", "�䳢", "����"}, {"���", "�ٳ���", "��", "Ű��"}, {"��", "����", "����", "�ܿ�"}};
		
		for(int i = 0; i<favs.length; i++) {
			for(int j = 0; j<favs[i].length; j++) {
				System.out.print(favs[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] favs2 = new int[3][2];
		
//		favs2[0][0] = 10; favs2[0][1] = 20;
//		favs2[1][0] = 30; favs2[1][1] = 40;
//		favs2[2][0] = 50; favs2[2][1] = 60;
		int count = 1;
		
		for(int i=0; i<favs2.length; i++) {
			for (int j = 0; j < favs2[i].length; j++) {
				favs2[i][j] = count++*10;
			}
			System.out.println();
		}
		
		for(int i=0; i<favs2.length; i++) {
			for (int j = 0; j < favs2[i].length; j++) {
				System.out.print(favs2[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
