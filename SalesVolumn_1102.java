import java.util.Scanner;

public class SalesVolumn_1102 {

		public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);

			int[][] month=new int[3][12];
			int[] sum=new int[3];
			int tot=0;

			for(int i=0; i<sum.length; i++) sum[i]=0;
			for(int i=0; i<month.length; i++) {
				System.out.print((2018+i)+"년도 : ");
				for(int j=0; j<month[i].length; j++) {
					month[i][j]=sc.nextInt();
					sum[i]+=month[i][j];
				}
			}

			for(int i=1; i<=12; i++)
				System.out.print("\t"+i+"월");
			System.out.print("     연간판매량    누적판매량");
			System.out.println();
				
			for(int i=0; i<month.length; i++) {
				System.out.print((2018+i)+"년도 : ");
				for(int j=0; j<month[i].length; j++) 
					System.out.print(month[i][j]+"\t");
       			tot+=sum[i]; 
       			System.out.println(sum[i]+"\t"+tot);
			}
			
	}

}
