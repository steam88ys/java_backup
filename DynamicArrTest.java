package test.arr2;

public class DynamicArrTest {

	public static void main(String[] args) {

//		동적 배열 : 2차원 배열에서 각 행마다 열의 개수가 다른 배열
		
//		int[][] nums = {{10}, {20, 30}, {40, 50, 60}};
		int[][] nums = new int[3][];
		
		int count = 1;
		for(int i=0; i<nums.length; i++) {
			nums[i] = new int[i+1];
			for(int j = 0; j<nums[i].length; j++) {
				nums[i][j] = count++ * 10;
			}
		}
		
		for (int i= 0;  i< nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
