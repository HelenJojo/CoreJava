package inheritance;



class Cycle{
	String define_me() {
		return "a vehicle with pedals";
	}
}
class MotorCycle extends Cycle{
	String define_me() {
		return "a cycle with an engine";
	}
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+define_me());
		String temp=super.define_me();
		System.out.println("My ancestor is a cycle who is "+temp);
	}
}
class Bike extends Cycle{
	String define_me() {
		return "a cycle with an engine";
	}
	Bike(){
		System.out.println("Hello I am a Bike I am " +define_me());
		String temp=define_me();
		System.out.println("My ancestor is a cycle who is "+temp);
	}
}
class InheritanceExample{
	public static void main(String []args) {
		
		Bike b1=new Bike();
		MotorCycle m= new MotorCycle();
	}
}