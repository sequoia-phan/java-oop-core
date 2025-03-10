package Inheritance.Polymorphism.Abstract;

class MyDogList {
	private Dog[] dogs = new Dog[5];
	private int nextIndex = 0;

	void add(Dog d) {
		if (nextIndex < dogs.length) {
			dogs[nextIndex] = d;
			System.out.println("Dog added at " + nextIndex);
			nextIndex++;
		}
	}
}
