public class ForExam1 {
	public static void main(String args[]) {
		int i;

		for ( i = 1 ; i <= 5 ;  i++) {
			System.out.print(i+"\t");
			System.out.println(i);
		}
		System.out.println();
		
		for (  i = 1; i <= 10; i += 3) {
			System.out.print(i+"\t");
			System.out.println(i);
		}
		System.out.println();
		for (  i = 10 ; i > 5 ; i--) {
			System.out.print(i+"\t");
			System.out.println(i);
		}
	}
}