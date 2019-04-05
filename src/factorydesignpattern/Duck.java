package factorydesignpattern;

public class Duck implements Bird{

	@Override
	public void fly() {
		System.out.println("Ducks like sitting in the water more than flying");
		
	}

	@Override
	public void tweet() {
		System.out.println("Ducks love to make quacking sounds");
		
	}

}
