package factorydesignpattern;

/*
 * Factory pattern is a creational pattern that defines an interface for creating an 
 * object, but let subclasses decide which class to instantiate. 
 * The Factory method lets a class defer instantiation it uses to subclasses
 */

public interface Bird {
	
	public void fly();
	public void tweet();

}
