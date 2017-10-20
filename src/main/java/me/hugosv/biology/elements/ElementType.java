package me.hugosv.biology.elements;

/**
 *
 * @author EHT
 */
public enum ElementType {
	CARBON("Carbon",'C',6),
	HYDROGEN("Hydrogen",'H',1),
	NITROGEN("Nitrogen",'N',7),
	OXYGEN("Oxygen",'O',6),
	PHOSPHORUS("Phosphorus",'P',15),
	SULFUR("Sulfur",'S',16);

	private final String name;
	private final char symbol;
	private final int atomicNumber;

	private ElementType(String name, char symbol, int atomicNumber) {
		this.name = name;
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
	}	

	public String getName() {
		return name;
	}

	public char getSymbol() {
		return symbol;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}
}
