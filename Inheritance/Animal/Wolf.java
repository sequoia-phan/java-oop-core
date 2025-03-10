package Inheritance.Animal;

class Wolf extends Canine {
	@Override
	void makeNoise() {
		System.out.println("The wolf is making noisy");
	}
	
	@Override
	void eat() {}

	void runBehavior() {
		super.superBehavior();
	}


}
