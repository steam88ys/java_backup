package exception01;

public class FileExam3 {
	public static void main (String[] args) {
		String[] irum = new String[3];
		// irum[0], irum[1], irum[2] 3�� ����
		
		try {
			for(int i = 0; i<=irum.length; i++)
				System.out.println(irum[i]);
			// irum[3]�Ǿ����� catch������ �����ϰ� �ȴ�.
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻�");
		}
	}
	
}
