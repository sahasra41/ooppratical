package oop_pratical;
 class Vechile{
	int maxSpeed=120;
}
class Car extends Vechile{
	int maxspeed=100;
	void display() {
		System.out.println("Maxspeed " +super.maxSpeed);
	}
}
public class Super {
public static void main(String[] args) {
	Car small=new Car();
	small.display();
}
}
