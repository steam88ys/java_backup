package Inheritance04;

public class InstanceOfEx {
	
	static void print (Person p) {
		if(p instanceof Person)	// p(Person)가 Person에 속하거나 상속 받는 클래스에 속하면 true, 아니면 false
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
