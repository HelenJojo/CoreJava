package exceptions;


class ExceptionA extends Exception{
	public ExceptionA(String msg) {
		super(msg);
	}
	
}
class ExceptionB extends ExceptionA{
	public ExceptionB(String msg) {
		super(msg);
	}
	
}
class ExceptionC extends ExceptionB{
	public ExceptionC(String msg) {
		super(msg);
	}
	
}

public class InheritingException {
	public static void main (String [] args) {
		try {
			method_B();
		}
		catch(ExceptionA a){
			a.printStackTrace();
		}
		try {
			method_C();
		}catch(ExceptionA a) {
			a.printStackTrace();
		}
	}

	public static void method_B() throws ExceptionB{
		throw new ExceptionB(" B ");
		
	}
	public static void method_C() throws ExceptionC{
		throw new ExceptionC(" C ");
		
	}
	
}
