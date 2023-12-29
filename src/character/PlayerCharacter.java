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
		race.ApplyRaceModifiers(race.getName());

	}

	@Override
	public int Random(double number) {
		// TODO Auto-generated method stub

		return (int) (Math.random() * number + 1);
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
