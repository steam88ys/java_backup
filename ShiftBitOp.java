public class ShiftBitOp {
	public static void main(String args[ ]) {
		int a=-65;
		int c;
		c=(a>>3);
		System.out.println(c); //-9
		c=(a<<3);
		System.out.println(c); //-520
		c=(a>>>3);
		System.out.println(c); //536870903 �����ε� 0���� ä���༭

		/*  byte c=65;
		System.out.println(c>>3); //8
		System.out.println(c<<3); //520
		System.out.println(c>>>3);//8, �ڵ�����ȯ

		c=a>>3�� ���� �����ϰ� c�� ����ϸ�
		���� 520�� byte������ �ȵ� */
	}
}