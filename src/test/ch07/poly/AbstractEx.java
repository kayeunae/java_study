package test.ch07.poly;

public class AbstractEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}
	
	//부모 객체타입으로 매개변수를 받게 해준다.
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
