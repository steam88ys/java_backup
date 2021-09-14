
public class Test_03 {

	public static void main(String[] args) {
		// static class stack heap
		
		//Call by Value  기본형 타입, 프리미티브 타입(=값에 의한 호출)
		// Call by reference  참조형 타입, 레퍼런트 타입(=주소에 의한 호출)
		
//		String str1 = "A";
//		System.out.println(str1 + 1); // 뒤에있는 1이 call by reference로 바뀜
		
//		char ch='A';
//		System.out.println(ch +1);
//		System.out.println((char)(ch +1));
		
//		int a=10;
//		int b=10;
//		int c=a+b;
//		
//		if(a==b)
//			System.out.println("같다.");
//		else 
//			System.out.println("다르다.");
		
		String str1 = new String("Hi");
		String str2 = new String("Hi");
		
		//System.out.println(str1+str2);  //+가 문자 연결자로 바뀜
		
		if(str1.equals(str2))
			System.out.println("같다.");
		else
			System.out.println("다르다.");
		
		
		
	}

}
