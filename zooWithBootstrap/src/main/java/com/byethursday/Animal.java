package com.byethursday;

public class Animal {

	private String animalID = null;
	private String animalSpecies = null;
	private String animalHabitat = null;
	private String animalDiet = null;
	private String animalActivity = null;

	public Animal(String animalID, String animalSpecies, String animalHabitat, String animalDiet, String animalActivity) {
		super();
		this.animalID = animalID;
		this.animalSpecies = animalSpecies;
		this.animalHabitat = animalHabitat;
		this.animalDiet = animalDiet;
		this.animalActivity = animalActivity;
	}

	public Animal() {
		super();
	}

	public String getAnimalID() {
		return animalID;
	}

	public void setAnimalID(String animalID) {
		this.animalID = animalID;
	}

	public String getanimalSpecies() {
		return animalSpecies;
	}

	public void setanimalSpecies(String animalSpecies) {
		this.animalSpecies = animalSpecies;
	}

	public String getAnimalHabitat() {
		return animalHabitat;
	}

	public void setAnimalHabitat(String animalHabitat) {
		this.animalHabitat = animalHabitat;
	}

	public String getAnimalDiet() {
		return animalDiet;
	}

	public void setAnimalDiet(String animalDiet) {
		this.animalDiet = animalDiet;
	}

	public String getAnimalActivity() {
		return animalActivity;
	}

	public void setAnimalActivity(String animalAge) {
		this.animalActivity = animalAge;
	}

	@Override
	public String toString() {
		return "Animal [animalID=" + animalID + ", animalSpecies=" + animalSpecies + ", animal habitat=" + animalHabitat + ", animal diet=" + animalDiet
				+ ", and the animal was" + animalActivity + "]";
	}

}
