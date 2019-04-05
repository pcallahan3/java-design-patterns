package factorydesignpattern;

public class Eagle implements Bird {

	@Override
	public void fly() {
		System.out.println("Eagles fly so high");
		
	}

	@Override
	public void tweet() {
		System.out.println("Eagles dont tweet I make high-pitched whistling");
		
	}

}
