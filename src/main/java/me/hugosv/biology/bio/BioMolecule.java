package me.hugosv.biology.bio;

import java.util.List;

/**
 *
 * @author Hugo Sanchez
 */
public abstract class BioMolecule {

	private final BioMoleculeType type;
	private final List<BioElement> bioElements;

	public BioMolecule(BioMoleculeType type, List<BioElement> bioElements) {
		this.type = type;
		this.bioElements = bioElements;
	}

	public BioMoleculeType getType() {
		return type;
	}

	public List<BioElement> getBioElements() {
		return bioElements;
	}

}
