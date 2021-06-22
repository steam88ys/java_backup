public class IncreaseOp{
	public static void main(String args[]) {
		int num=0;
		num=num+1;
		System.out.println("num :"+num); //1
		System.out.println("++num :"+(++num)); //2
		System.out.println("num++ :"+num++); //2
		System.out.println("num :"+num); //3
		System.out.println("--num :"+--num); //2
		System.out.println("num-- :"+num--); //2
		System.out.println("num :"+num); //1
	}
}