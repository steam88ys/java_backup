package Array;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] su=new int[100];
		int sum=0;
		int buho=1;;
		
		for(int i=0; i<su.length; i++) {
			su[i]=(i+1);
			buho=-1;
			if(su[i]%2==0) {
					System.out.print(su[i]*buho);
			}
			
			else {
				buho=1;
				if(i==0) {
					System.out.print(su[i]);
				}
				else {
					System.out.print("+"+su[i]);
				}
			}
			sum+=su[i]*buho;
		}
		System.out.print(" = "+(sum*buho));
		
	}

}
