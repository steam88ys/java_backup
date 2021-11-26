package Class;

class BoxMemeber{
	
	int width;
	int height;
	int depth;
	
}

public class box_member {

	public static void main(String[] args) {
		
		int my_count1 = 100;
		int my_count2 = my_count1;
		BoxMemeber mybox1 = new BoxMemeber();
		BoxMemeber mybox2 = mybox1;
		
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 30;
		
		System.out.println(mybox2.width+" "+mybox2.height+" "+mybox2.depth);
		
		mybox2.height = 50;
		System.out.println(mybox1.width+" "+mybox1.height+" "+mybox1.depth);
		
	}

}
