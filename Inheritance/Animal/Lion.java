package Inheritance.Animal;

class Lion extends Feline {
	@Override
	void makeNoise() {
		System.out.println("The lion is making noisy");
	}
	
	@Override
	void eat() {}
}
