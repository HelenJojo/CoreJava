package exceptions;


public class RethrowingExceptions {
	
	public static void someMethod2() throws Exception{
		System.out.println("Exception is in someMethod2() ");
		throw new Exception ("Thrown from someMethod2() ");
	}
	
	public static void someMethod() throws Exception{
		try {
			someMethod2();
		}
		catch( Exception e) {
			System.out.println(" Inside someMethod()");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			someMethod();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
