package demo;

public class AnimalFactory {
	
	public Animal getAnimal(String animal){
		
		if(animal==null){
			return null;
		}
		
		
		
		if(animal.equalsIgnoreCase("pig")){
			return new Pig();
		}else if(animal.equalsIgnoreCase("dog")){
			return new Dog();
		}else if(animal.equalsIgnoreCase("cat")){
			return new Cat();
		}
		return null;
	}

}
