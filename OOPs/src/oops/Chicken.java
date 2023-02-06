package oops;

public class Chicken extends Bird{

	public Chicken(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
	}

	//Overriding the method defined in Bird (Overriding = Replacing)
//	public void fly() {
//		System.out.println("Chicken is not able to fly...");
//	}
}
