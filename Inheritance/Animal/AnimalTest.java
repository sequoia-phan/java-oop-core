package Inheritance.Animal;

class AnimalTest {
	public static void main(String[] args) {
		Animal[] animals  = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Hippo();

		int count = 0;
		while (count < animals.length) {
			if (animals[count] instanceof Animal) {
				animals[count].makeNoise();
			}
			count++;
		}

		System.out.println("--------------------------");

		PetOwner po = new PetOwner();
		po.start();
	}
}
