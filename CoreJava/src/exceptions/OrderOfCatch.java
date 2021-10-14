package exceptions;

/*   Exception subclass must come before any of their superclass. 
 --> Because catch statement that uses super classes will catch the exception of that class only
 --> thus subclasses would never be reached if it came after super class
 --> U will receive an error message saying that first catch will handle all the Exceptions
 --> Thus the second catch statement will never execute.*/

class Parent {
	int a, b;

	void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int cal() {
		return (a / b);
	}
}

class Child extends Parent {
	int a, b, c;

	void setData(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	int cal() {
		return ((a / b) * c);
	}

}

public class OrderOfCatch {

	public static void main(String[] args) {

		try {
			Parent p = new Parent();
			p.setData(5, 0);
			int result1 = p.cal();
			System.out.println("Result 1 : " + result1);

			Child c = new Child();
			c.setData(5, 1, 1);
			int result2 = c.cal();
			System.out.println("Result 2 : " + result2);
		} catch (Exception e) {
			System.out.println(e);

		} /*catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		}
*/
	}

}
