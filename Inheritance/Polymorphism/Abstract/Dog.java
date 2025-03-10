package Inheritance.Polymorphism.Abstract;

class Dog extends Canine implements Pet {
	void bark() {
		System.out.println("The dog is barking...");
	}

	void go() {
		Dog aDog = new Dog();
		Object sameDog = getObject(aDog);
	}

	Object getObject(Object o) {
		return o;
	}

	public void beFriendly() {}
	public void play() {}
}
