package Array;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] su=new int[100];
		int sum=0;
		for(int i=0; i<su.length; i++) {
			su[i]=(i+1);
			
			if(i==0) {
				System.out.print(su[i]); 
			}
			else System.out.print("+"+su[i]);
			sum+=su[i];
		}
		System.out.print(" = "+sum);
		
	}

}
