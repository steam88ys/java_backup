package Class;

// 클래스 정의
class Car{
	String 모델명;
	String 제조사;
	void speedUp(){
		System.out.println(모델명 +"SpeedUp");
	}
	void stop(){
		System.out.println(제조사+"Stop");
	}
	Car(){
		System.out.println("기본생성자");
	}
	Car(String model, String comp) {	// 생성자 (Constructor)
		모델명=model;
		제조사=comp;
	}
}

public class Car_test {

	public static void main(String[] args) {
		
		Car morning = new Car("모닝", "현대");	// 생성자
		Car sm3 = new Car("SM3","삼성");
		// morning.모델명 = "모닝";
		// morning.제조사 = "현대";
		morning.speedUp();
		morning.stop();
		// sm3.모델명 = "SM3";
		// sm3.제조사 = "삼성";
		sm3.speedUp();
		sm3.stop();
		
	}

}
