package inheritance;

class Animals {
	public String furColor;
	private String eyes;

	public void makeNoise() {
		System.out.println("I have " + furColor + " fur and I'm Making noise");
	}

	private void makingNoise() {
		System.out.println("I have " + furColor + " fur and I'm Making noise");
	}

	public String getColor() {
		return eyes;
	}

	public void setColor(String eyes) {
		this.eyes = eyes;
	}
	

}

class Dogs extends Animals {
	public String fav;
	@Override
	public void makeNoise() {
		System.out.println("My fav thing is "+fav);
	}
}

public class FourthEx {
	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		d1.furColor = "Brown"; // inheriting public prop. of parent
		d1.makeNoise(); // inheriting public method of parent class
		// d.makingnoise(); --cannot inherit private properties or methods
	
		Dogs d2 = new Dogs();
		d2.setColor("Brown");
		System.out.println("I am dog with "+d2.getColor()+" eyes.");
	
		Dogs d3 = new Dogs();
		d3.fav="Bone";
		d3.makeNoise();
	}
}
