public class ShiftBitOp {
	public static void main(String args[ ]) {
		int a=-65;
		int c;
		c=(a>>3);
		System.out.println(c); //-9
		c=(a<<3);
		System.out.println(c); //-520
		c=(a>>>3);
		System.out.println(c); //536870903 음수인데 0으로 채워줘서

		/*  byte c=65;
		System.out.println(c>>3); //8
		System.out.println(c<<3); //520
		System.out.println(c>>>3);//8, 자동형변환

		c=a>>3등 으로 지정하고 c를 출력하면
		오류 520이 byte범위에 안들어감 */
	}
}