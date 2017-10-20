package me.hugosv.biology.bio;

/**
 *
 * @author Hugo Sanchez V
 */
public enum BioMoleculeType {
	ADN("ADN"),
	ARN("ARN"),
	MINERAL("Mineral"),
	CARBOHYDRATE("Carbohydrate"),
	LIPID("Lipid"),
	PROTEIN("Protein");
	
	private final String name;
	
	private BioMoleculeType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
