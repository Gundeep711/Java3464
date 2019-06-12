package OOPSConcept;

public class Pokemon {
	// Properties
	private String name;
	private String type;
	private int hp;
	//protected  any inside the package
	//public anyone

	// constructor
	public Pokemon(String name, String type, int hp) {
		this.name=name;
		this.type = type;
		this.hp = hp;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// methods
	

}
