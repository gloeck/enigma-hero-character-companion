package race;

import java.util.ArrayList;

import character.AbilityScores;
import character.CommonMethods;
import proficiency.Proficiency;
import proficiency.Skill;

public class Race implements CommonMethods {

	private String name;
	private Double speed;
	private String suggestedAlignment;
	private ArrayList<String> racialTraits;
	private String size;
	private String subrace;
	
	private Proficiency proficiency;

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
		RepositoryRace randomRace;
		randomRace = RepositoryRace.RaceList().get(Random(RepositoryRace.RaceList().size()));

		this.setName(randomRace.getName());
		this.setSpeed(randomRace.getSpeed());
		this.setSuggestedAlignment(randomRace.getAlignment());
		this.setRacialTraits(randomRace.getRacialTraits());
		this.setSize(randomRace.getSize());
		this.setSubrace(randomRace.getSubrace().get(Random(randomRace.getSubrace().size())));
		return this;
	}
	
	public void ApplyRaceModifiers(String name) {
		switch (name) {
		case "Dwarf":
			DwarfModifiers(getSubrace());
			break;

		case "Elf":
			ElfModifiers(getSubrace());
			break;

		case "Halfling":
			HalflingModifiers(getSubrace());
			break;

		case "Human":
			HumanModifiers(getSubrace());
			break;

		case "Dragonborne":
			DragonborneModifiers(getSubrace());
			break;

		case "Gnome":
			GnomeModifiers(getSubrace());
			break;

		case "Half-Elf":
			HalfElfModifiersRandom();
			break;

		case "Half-Orc":
			HalfOrcModifiers();
			break;

		case "Tiefling":
			TieflingModifiers();
			break;
		}
	}

	public void DwarfModifiers(String subrace) {
		AbilityScores.setConstitution(AbilityScores.getConstitution() + 2);
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add("Dwarvish");
		//por enquanto hardcode em "equipamentos"
		this.getProficiency().setWeapon(new ArrayList<>());
		this.getProficiency().getWeapon().add("Battleaxe");
		this.getProficiency().getWeapon().add("Handaxe");
		this.getProficiency().getWeapon().add("Throwing Hammer");
		this.getProficiency().getWeapon().add("Warhammer");
		this.getProficiency().setTool(new ArrayList<>());
		this.getProficiency().getTool().add("Smith's Tools");
		if (subrace == "Hill Dwarf") {
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			this.getRacialTraits().add("Dwarven Toughness");
			//implementar l�gica de aumento de 1 de vida/n�vel
		} else {
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			this.getRacialTraits().add("Dwarven Armor Training");
			this.getProficiency().setArmor(new ArrayList<>());
			this.getProficiency().getArmor().add("Light Armor");
			this.getProficiency().getArmor().add("Medium Armor");
		}
	}

	public void ElfModifiers(String subrace) {
		AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add("Elvish");
		if (subrace == "High Elf") {
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			this.getRacialTraits().add("Cantrip");
			this.getProficiency().setWeapon(new ArrayList<>());
			this.getProficiency().getWeapon().add("Longsword");
			this.getProficiency().getWeapon().add("Shortsword");
			this.getProficiency().getWeapon().add("Shortbow");
			this.getProficiency().getWeapon().add("Longbow");
			this.getProficiency().getLanguage().add(this.getProficiency().RandomLanguage());
		} else if (subrace == "Wood Elf") {
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			this.getRacialTraits().add("Mask of the Wild");
			this.setSpeed(10.5);
			this.getProficiency().setWeapon(new ArrayList<>());
			this.getProficiency().getWeapon().add("Longsword");
			this.getProficiency().getWeapon().add("Shortsword");
			this.getProficiency().getWeapon().add("Shortbow");
			this.getProficiency().getWeapon().add("Longbow");
		} else {
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
			this.getRacialTraits().add("Superior Darkvision");
			this.getRacialTraits().add("Sunlight Sensitivity");
			this.getRacialTraits().add("Drow Magic");
			this.getProficiency().setWeapon(new ArrayList<>());
			this.getProficiency().getWeapon().add("Rapiers");
			this.getProficiency().getWeapon().add("Shortsword");
			this.getProficiency().getWeapon().add("Hand Crossbows");
		}
	}

	public void HalflingModifiers(String subrace) {
		AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add("Halfling");
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
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add(this.getProficiency().RandomLanguage());
	}

	public void DragonborneModifiers(String subrace) {
		AbilityScores.setStrength(AbilityScores.getStrength() + 2);
		AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add("Draconic");
	}

	public void GnomeModifiers(String subrace) {
		AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 2);
		this.setProficiency(new Proficiency("race"));
		this.getProficiency().getLanguage().add("Gnomish");
		if (subrace == "Forest Gnome") {
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			this.getRacialTraits().add("Natural Illusionist");
			this.getRacialTraits().add("Speak with Small Beasts");
		} else {
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			this.getRacialTraits().add("Artificer�s Lore");
			this.getRacialTraits().add("Tinker");
		}
	}

	public void HalfElfModifiersRandom() {
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
			AbilityScores.RandomIncrease1HalfElf();
			AbilityScores.RandomIncrease1HalfElf();
			this.setProficiency(new Proficiency("race"));
			this.getProficiency().getLanguage().add("Elvish");
			this.getProficiency().getLanguage().add(this.getProficiency().RandomLanguage());
			Skill skill = new Skill();
			skill.RandomSkill();
			this.getProficiency().setSkill(new ArrayList<>());
			this.getProficiency().AddSkill(skill);
	}

	public void HalfOrcModifiers() {
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			this.setProficiency(new Proficiency("race"));
			this.getProficiency().getLanguage().add("Orc");
		}

	public void TieflingModifiers() {
		
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
			this.setProficiency(new Proficiency("race"));
			this.getProficiency().getLanguage().add("Infernal");
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
	
	public Proficiency getProficiency() {
		return proficiency;
	}

	public void setProficiency(Proficiency proficiency) {
		this.proficiency = proficiency;
	}

}
