public class Array{
	public static void main(String args[]) {
		//int [] a;	// int a[];
		//a=new int[5];
		//int [] a=new int[5];
		//a[0]=1; 
		//a[3]=3;
		//int[] a={1, 2, 3, 4, 5};
		
		int [] a=new int[]{1, 2, 3, 4, 5};  //절대 대괄호 안에 갯수 쓰지 않기
		for(int i=0; i<=4; i++) System.out.print(a[i]);
		
		int[] b=new int[100];
		System.out.println("**************"+b.length);
		for(int i=0; i<b.length; i++){
				b[i]=10;	//100개 방에 모두 10넣기
				System.out.println(i+" : "+b[i]);
		}

	}
}