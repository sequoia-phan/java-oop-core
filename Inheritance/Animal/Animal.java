package Inheritance.Animal;

class Animal {
	String picture;
	String food;
	String hunger;
	boolean boundaries;
	String location;

	void makeNoise(){}
	void eat(){}
	void sleep(){}
	void roam(){
		System.out.println("Roaming...");
	}

	void hunting() {
		System.out.println("I am batman hunting...");
	}
}
