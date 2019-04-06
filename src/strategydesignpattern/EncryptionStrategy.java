package strategydesignpattern;

/*
 * 	The Strategy pattern is a behavioral pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 *  Strategy lets the algorithm vary independently from the clients that use it
 */

public interface EncryptionStrategy {
	 void encryptData(String plainText);

}
