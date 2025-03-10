package Inheritance.Animal;

class Dog extends Canine {
	@Override
	void makeNoise() {
		System.out.println("The Dog is making noisy");
	}
	
	@Override
	void eat() {}
}

