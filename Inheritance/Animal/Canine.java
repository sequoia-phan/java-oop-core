package Inheritance.Animal;

class Canine extends Animal{
	@Override
	void roam() {}

	void superBehavior() {
		super.roam();
	}

	void canineMeow() {
		System.out.println("canine meowing...");
	}
}
