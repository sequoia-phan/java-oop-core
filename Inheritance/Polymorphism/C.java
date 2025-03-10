package Inheritance.Polymorphism;

class C extends B {

	@Override
	void m3() {
		System.out.println("C's m3, " + (ivar + 6));
	}
}
