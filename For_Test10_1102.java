public class For_Test10_1102 {
	public static void main(String args[]) {
		for(int i=1; i<=20; i++) {
			for(int j=2; j<=20; j++) {
				int a=(i+j);
				System.out.println(i+"+"+j+"="+a);
				i=a;
			}
		}
	}
}
