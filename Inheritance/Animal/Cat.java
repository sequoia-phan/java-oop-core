package Inheritance.Animal;

class Cat extends Feline {
	@Override
	void makeNoise() {
		System.out.println("The cat is making noisy");
	}
	
	@Override
	void eat() {}
}
