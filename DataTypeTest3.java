public class DataTypeTest3 {
	public static void main(String args[]){
		int a = 130;
		byte b = (byte)a;  // a int  -> byte
		byte d=(byte) (a+b);  //260    a int   a+b int   ->a

		System.out.println("a+b :"+d);
	}
}
