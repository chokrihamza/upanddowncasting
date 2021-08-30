package domain;

public enum TypeWriter {

	CLASSIC ("Handwriting"),
	MODERN ("Digital Writing");

	private final String description;

	private TypeWriter(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}


}
