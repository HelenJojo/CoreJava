package inheritance;

class A{
	void method1() {
		System.out.println("Class A, parent class");
	}
}
class B extends A{
	void method() {
		System.out.println("Class B , child class");
	}
}
public class ExampleInheritance {

	public static void main(String[] args) {
		B b1 = new B();
		b1.method1();// inheriting method of parent class using child class object
		b1.method();//method of child class
	}

}
