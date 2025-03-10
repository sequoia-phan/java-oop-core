class Dog {
	String name;

	void bark() {
		if (name == null) return;

		System.out.println(name + "is barking...");
	}

	void eat() {

		if (name == null) return;
		System.out.println(name + "is eating...");
	}

	void chaseCat() {
		if (name == null) return;
		System.out.println(name + "is chasing a cat");
	}
}
