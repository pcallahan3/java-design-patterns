package adapterdesignpattern;

/*
 * Convert the interface of a class into another interface clients expect. 
 * Adapter lets classes work together that couldn�t otherwise because of incompatible interfaces.
 */

public interface TextFormattable {
	String formatText(String text);
}