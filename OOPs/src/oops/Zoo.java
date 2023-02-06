package oops;

public class Zoo {

	public static void main(String[] args) {

//		Animal animal1 = new Animal(12,"M",23);
//		animal1.eat();
//		
//		Bird bird1 = new Bird(3,"F",10);
//		bird1.fly();
//		bird1.eat();
//		bird1.sleep();
//		
//		Chicken chick1 = new Chicken(1,"M",7);
//		chick1.fly();
		
		Sparrow sparrow1 = new Sparrow(1, "M", 4); // (here we can call all methods belongs to Sparrow)
		sparrow1.move();
		
//		Animal sparrow1 = new Sparrow(1, "M", 4);// (here we can call only high level methods )
//		sparrow1.move();
		
		Animal fish1 = new Fish (1, "F",2);
		fish1.move();
		

//		Fish fish1 = new Fish (1, "F",2);
//		fish1.move();
		
		moveAnimals(fish1);
		moveAnimals(sparrow1);
	}
	
	public static void moveAnimals (Animal animal) {
		animal.move();
	}
}