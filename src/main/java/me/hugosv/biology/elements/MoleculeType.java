package me.hugosv.biology.elements;

/**
 *
 * @author Hugo Sanchez V
 */
public enum MoleculeType {
	WATER("Water");
	
	private final String name;

	private MoleculeType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
