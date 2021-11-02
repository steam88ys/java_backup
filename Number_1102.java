
public class Number_1102 {

	public static void main(String[] args) {
		
		int max=1;
		int min=31;
		int su;
		int[] count= new int[51];
		for(int i=1; i<=50; i++) {
			su=(int)(Math.random()*30+1);
			count[su]++;
			System.out.print(su+"\t");
			if(i%10==0) System.out.println();
			if(su>max) max=su;
			if(su<min) min=su;
		}
		System.out.println();
		System.out.println("최대값 : "+max+" 최소값 : "+ min);
		int fmax = 0;
		int fsu=0;
		for(int i=1; i<=30; i++) {
			if(count[i]>fmax) {
				fmax = count[i];
				fsu = i;
			}
		}
		System.out.println("가장 빈도수가 높은 수는 "+fsu+"로 "+fmax+"번 발생");
		
		
	}

}
