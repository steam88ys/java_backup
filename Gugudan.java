public class Gugudan {
	public static void main(String args[]) {
		for (int i=2; i<=9; i++) {
			int a=22;
			int b=25;
			System.out.print(i+"��");
			lineprint(a, '@');
			lineprint(b, '-');
			for(int j=1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			lineprint(b, '=');
		}
	}
	static void lineprint(int su, char c) {         //  (int su) �� �Ű�������� �θ���, return ���� ���� ���� void
		for(int i=1; i<=su; i++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
}