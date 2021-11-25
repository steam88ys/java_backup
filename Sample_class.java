package Class;

class Ex_class {
	
	String car_name;
	private int size;
	
	void SetSize (int size) {
		this.size = size;
	}
	
	public int GetSize () {
		return size;
	}
	
}

public class Sample_class {

	public static void main(String[] args) {

		Ex_class ex = new Ex_class();
		ex.car_name = "그랜져";
		ex.SetSize(2500);
		System.out.println("차종 :"+ex.car_name+" 크기 :"+ ex.GetSize());
		
	}

}
