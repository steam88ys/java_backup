package TextInheritance06;

public class Truck extends Car {

	int ton = 5;
	
	void speedUp() {	// �� ����
		velocity += 10;
		System.out.println("�ӵ� " + velocity + " ����");
	}
	
}
