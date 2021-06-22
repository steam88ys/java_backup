public class For_Test2 {
	public static void main(String args[]) {
		int cnt=1;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				if(cnt==10)  System.out.print(cnt);									else  System.out.print("0"+cnt);
				cnt++;
			}
			 System.out.println();
			
		}
	}
}
