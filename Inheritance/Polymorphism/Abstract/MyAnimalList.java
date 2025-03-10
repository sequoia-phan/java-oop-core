package Inheritance.Polymorphism.Abstract;

class MyAnimalList {
	private Animal[] animals = new Animal[5];
	private int nextIndex = 0;

	void add(Animal a) {
		if (nextIndex < animals.length) {
			animals[nextIndex] = a;
			System.out.println("Animal added at " + nextIndex);
			nextIndex++;
		}
	}
}
