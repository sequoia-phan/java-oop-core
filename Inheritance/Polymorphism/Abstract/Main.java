package Inheritance.Polymorphism.Abstract;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		ArrayList<Object> myDogArrayList = new ArrayList<Object>();
		Dog aDog = new Dog();
		myDogArrayList.add(aDog);
		Object d = myDogArrayList.get(0);
		System.out.println("get class: " + d.getClass());
		System.out.println("get hashcode: " + d.hashCode());
	}
}
