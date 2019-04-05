package factorydesignpattern;

public class Parrot implements Bird{

	@Override
	public void fly() {
		System.out.println("A parrot flies when Im not caged");
		
	}

	@Override
	public void tweet() {
		System.out.println("Parrots have an extensive vocabulary");
		
	}

}
