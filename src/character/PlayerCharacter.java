package character;

import race.Race;

public class PlayerCharacter implements CommonMethods {

	private String characterName;
	private int hitPoints;
	private int proficienyBonus;
	//private int experience;
	//private int /level;
	//private String alignment;
	//private int acBonus;
	//private int attackBonus;
	//private String personalityTraits;
	//private String ideals;
	//private String bonds;
	//private String flaws;

	@SuppressWarnings("unused")
	private AbilityScores abilityScores;

	private Race race;

	//

	public PlayerCharacter() {

	}

	public PlayerCharacter(String characterName, int hitPoints, int proficienyBonus) {
		this.characterName = characterName;
		this.hitPoints = hitPoints;
		this.proficienyBonus = proficienyBonus;

		this.abilityScores = new AbilityScores();

		race = new Race();
		race.RandomRace();
		ApplyRaceModifiers(race.getName());

	}

	@Override
	public int Random(double number) {
		// TODO Auto-generated method stub

		return (int) (Math.random() * number + 1);
	}

	public int CalculateAbilityScoreModifier(int ability) {
		return (ability - 10) / 2;
	}

	public int Increase2(int score) {
		return score = +2;
	}

	public int Increase1(int score) {
		return score = +1;
	}

	public void ApplyRaceModifiers(String name) {
		switch (name) {
		case "Dwarf":
			race.DwarfModifiers(race.getSubrace());
			break;

		case "Elf":
			race.ElfModifiers(race.getName());
			break;

		case "Halfling":
			race.HalflingModifiers(race.getName());
			break;

		case "Human":
			race.HumanModifiers(race.getName());
			break;

		case "Dragonborne":
			race.DragonborneModifiers(race.getName());
			break;

		case "Gnome":
			race.GnomeModifiers(race.getName());
			break;

		case "Half-Elf":
			race.HalfElfModifiersRandom();
			break;

		case "Half-Orc":
			race.HalfOrcModifiers();
			break;

		case "Tiefling":
			race.TieflingModifiers();
			break;
		}
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public int getProficienyBonus() {
		return proficienyBonus;
	}

	public void setProficienyBonus(int proficienyBonus) {
		this.proficienyBonus = proficienyBonus;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

}
