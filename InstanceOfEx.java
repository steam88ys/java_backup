package Inheritance04;

public class InstanceOfEx {
	
	static void print (Person p) {
		if(p instanceof Person)	// p(Person)�� Person�� ���ϰų� ��� �޴� Ŭ������ ���ϸ� true, �ƴϸ� false
			System.out.print("Person ");
		if(p instanceof Student)
			System.out.print("Student ");
		if(p instanceof Researcher)
			System.out.print("Researcher ");
		if(p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}
	
	public static void main(String[] args) {

		System.out.print("new Student() -->\t"); print(new Student());	// Person Student
		System.out.print("new Researcher() -->\t"); print(new Researcher());	// Person Researcher
		System.out.print("new Professor() -->\t"); print(new Professor());	// Person Researcher Professor
		
	}

}
