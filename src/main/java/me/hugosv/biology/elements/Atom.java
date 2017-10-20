package me.hugosv.biology.elements;

/**
 *
 * @author Hugo Sanchez
 */
public abstract class Atom {

	private final ElementType type;

	public Atom(ElementType type) {
		this.type = type;
	}

	public ElementType getType() {
		return type;
	}
}
