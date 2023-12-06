package character;

public class PlayerCharacter implements CommonMethods {

	private String characterName;
	private int hitPoints;
	private int proficienyBonus;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	//
	
	public PlayerCharacter() {
		
	}
	
	/**
	 * @param characterName
	 * @param hitPoints
	 * @param proficienyBonus
	 */
	public PlayerCharacter(String characterName, int hitPoints, int proficienyBonus) {
		this.characterName = characterName;
		this.hitPoints = hitPoints;
		this.proficienyBonus = proficienyBonus;
		GenerateAbilityScores();
	}

	@Override
	public void Increase2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Increase1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int Random(double number) {
		// TODO Auto-generated method stub

		return (int) (Math.random() * number + 1);
	}

	private int RandomAbilityScore() {
		int abilityScore = 0;
		int lesserValue = 6;
		int roll = 0;
		for (int i = 0; i < 4; i++) {
			roll = Random(6);
			if (roll < lesserValue) {
				lesserValue = roll;
			}
			abilityScore += roll;
		}
		return abilityScore - lesserValue;
	}

	public void GenerateAbilityScores() {
		setStrength(RandomAbilityScore());
		setDexterity(RandomAbilityScore());
		setConstitution(RandomAbilityScore());
		setIntelligence(RandomAbilityScore());
		setWisdom(RandomAbilityScore());
		setCharisma(RandomAbilityScore());
	}

	public int CalculateAbilityScoreModifier(int ability) {
		return (ability - 10) / 2;
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

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

}
