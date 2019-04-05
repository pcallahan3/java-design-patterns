package factorydesignpattern;

public class BirdFactoryTestClass {
	
	public static void main(String args[]) {
		
		  BirdFactory birdFactory = new BirdFactory();

	      Bird parrot = birdFactory.getBirdType("parrot");
	      parrot.fly();
	      parrot.tweet();

	      Bird eagle = birdFactory.getBirdType("eagle");
	      eagle.fly();
	      eagle.tweet();

	      Bird duck = birdFactory.getBirdType("duck");
	      duck.fly();
	      duck.tweet();
	}

}
