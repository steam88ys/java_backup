public class ForExam4 {
	public static void main (String args[])	{
		for(int i=1; i<=5; i++)  {  //1 За
			for(int j=1; j<=i; j++)  // 1 2 3 4 5 ї­
				System.out.print(j+"  ");
			System.out.println();
		}
	}
}


/*

public class ForExam4 {
	public static void main (String args[])	{
		for(int i=1; i<=12; i++)  {  //1 За
			if(i%3==0) System.out.println();
			System.out.println(i+"\t");
		}
	}
}
1 2 3
4 5 6    3+ 1 2 3 
7 8 9
10 11 12

*/

int su=sc.nextInt();
for (int i=1; i<=su; i++)