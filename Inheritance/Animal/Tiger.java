package Inheritance.Animal;

class Tiger extends Feline {
	@Override
	void makeNoise() {
		System.out.println("The tiger is making noisy");
	}
	
	@Override
	void eat() {}
}
