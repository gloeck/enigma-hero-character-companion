package race;

import java.util.ArrayList;

import character.AbilityScores;
import character.CommonMethods;

public class Race implements CommonMethods {

	private String name;
	private Double speed;
	private String suggestedAlignment;
	private ArrayList<String> racialTraits;
	private String size;
	private String subrace;

	//

	public Race() {

	}

	public Race(String name, Double speed, String suggestedAlignment, ArrayList<String> racialTraits, String size,
			String subrace) {
		this.name = name;
		this.speed = speed;
		this.suggestedAlignment = suggestedAlignment;
		this.racialTraits = racialTraits;
		this.size = size;
		this.subrace = subrace;
	}

	@Override
	public int Random(double number) {
		// TODO Auto-generated method stub
		return (int) (Math.random() * number);
	}

	public Race RandomRace() {
		RepositoryRace<String, Double, String, String, ArrayList<String>, ArrayList<String>> randomRace;
		randomRace = RepositoryRace.RaceList().get(Random(RepositoryRace.RaceList().size()));

		this.setName(randomRace.getName());
		this.setSpeed(randomRace.getSpeed());
		this.setSuggestedAlignment(randomRace.getAlignment());
		this.setRacialTraits(randomRace.getRacialTraits());
		this.setSize(randomRace.getSize());
		this.setSubrace(randomRace.getSubrace().get(Random(randomRace.getSubrace().size())));
		return this;
	}

	public void DwarfModifiers(String subrace) {
		AbilityScores.setConstitution(AbilityScores.getConstitution() + 2);
		if (subrace == "Hill Dwarf") {
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			this.getRacialTraits().add("Dwarven Toughness");
		} else {
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			this.getRacialTraits().add("Dwarven Armor Training");
		}
	}

	public void ElfModifiers(String subrace) {
		AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
		if (subrace == "High Elf") {
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			this.getRacialTraits().add("Cantrip");
		} else if (subrace == "Wood Elf") {
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			this.getRacialTraits().add("Mask of the Wild");
			this.setSpeed(10.5);
		} else {
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
			this.getRacialTraits().add("Superior Darkvision");
			this.getRacialTraits().add("Sunlight Sensitivity");
			this.getRacialTraits().add("Drow Magic");
		}
	}

	public void HalflingModifiers(String subrace) {
		AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
		if (subrace == "Light Foot") {
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
			this.getRacialTraits().add("Naturally Stealthy");
		} else {
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			this.getRacialTraits().add("Stout Resilience");
		}
	}

	public void HumanModifiers(String subrace) {
		AbilityScores.setStrength(AbilityScores.getStrength() + 1);
		AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
		AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
		AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
		AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
		AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
	}

	public void DragonborneModifiers(String subrace) {
		AbilityScores.setStrength(AbilityScores.getStrength() + 2);
		AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
	}

	public void GnomeModifiers(String subrace) {
		AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 2);
		if (subrace == "Forest Gnome") {
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			this.getRacialTraits().add("Natural Illusionist");
			this.getRacialTraits().add("Speak with Small Beasts");
		} else {
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			this.getRacialTraits().add("Artificer’s Lore");
			this.getRacialTraits().add("Tinker");
		}
	}

	public void HalfElfModifiersRandom() {
		
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
			AbilityScores.RandomIncrease1HalfElf();
			AbilityScores.RandomIncrease1HalfElf();
	}

	public void HalfOrcModifiers() {
		
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
		}

	public void TieflingModifiers() {
		
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public String getSuggestedAlignment() {
		return suggestedAlignment;
	}

	public void setSuggestedAlignment(String suggestedAlignment) {
		this.suggestedAlignment = suggestedAlignment;
	}

	public ArrayList<String> getRacialTraits() {
		return racialTraits;
	}

	public void setRacialTraits(ArrayList<String> racialTraits) {
		this.racialTraits = racialTraits;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSubrace() {
		return subrace;
	}

	public void setSubrace(String subrace) {
		this.subrace = subrace;
	}

}
