
public class Quize_01 {

	public static void main(String[] args) {
		/* 100미만의 연속된 두 자릿수의 짝수 3개를 곱하였더니, 4****2가 되었다. 
		 이 세 개의 수는 어떤 수인지, 그리고 그 결과는 얼마인지 구하는 프로그램을 for
		 */
		int i, number;
		for(i=10; i<100; i++) {
			number = i * (i+2) * (i+4);
			
			if((number / 100000) == 4 && (number % 10) == 2) {
				System.out.println(i+" * "+ (i+2)+" * "+(i+4)+" = "+number);
				
			}
			
		}
		
	}

}


//public class Quize_01 {
//
//	public static void main(String[] args) {
//		/* 100미만의 연속된 두 자릿수의 짝수 3개를 곱하였더니, 4****2가 되었다. 
//		 이 세 개의 수는 어떤 수인지, 그리고 그 결과는 얼마인지 구하는 프로그램을 for
//		 */
//		int su1=0, su2=0, su3=0;
//		int gop=0;
//		
//		for(int i=10; i<97; i+=2) {
//			gop = su1 * su2 * su3;
//			su1 = i;
//			su2 = (su1+2);
//			su3 = (su2+2);
//			if(gop/2==0 && (gop-400000)/100000==0) {
//				break;
//			}
//			
//		}
//		
//		System.out.println("su1 = "+su1+", su2 = "+su2+", su3 = "+su3);
//		System.out.println("값 : "+gop);
//		
//		
//		
//	}
//
//}
