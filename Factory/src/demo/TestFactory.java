package demo;

public class TestFactory {

	public static void main(String[] args) {
		
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal cat = animalFactory.getAnimal("cat");
		cat.eat();

	}

}
