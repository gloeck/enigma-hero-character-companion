package character;

public class AbilityScores implements CommonMethods {

	private static int strength;
	private static int dexterity;
	private static int constitution;
	private static int intelligence;
	private static int wisdom;
	private static int charisma;

	public AbilityScores() {
		GenerateAbilityScores();
	}

	@Override
	public int Random(double number) {

		 int res = (int) (Math.random() * number +1);
		if (number < 1) {
			return 1;
		} else if (number > 6) {
			return 6;
		} else return res;
	}

	private int RandomAbilityScore() {
		int abilityScore = 0;
		int lesserValue = 6;
		int roll = 0;
		for (int i = 0; i <= 3; i++) {
			roll = Random(6);
			if (roll <= lesserValue) {
				lesserValue = roll;
			}
			abilityScore += roll;
		}
		abilityScore = abilityScore - lesserValue;
		if (abilityScore > 18) {
			return 18;
		} else {
			return abilityScore;
		}
	}

	private void GenerateAbilityScores() {
		setStrength(RandomAbilityScore());
		setDexterity(RandomAbilityScore());
		setConstitution(RandomAbilityScore());
		setIntelligence(RandomAbilityScore());
		setWisdom(RandomAbilityScore());
		setCharisma(RandomAbilityScore());
	}

	public static int CalculateAbilityScoreModifier(int ability) {
		return (ability - 10) / 2;
	}

	public static void RandomIncrease2() {
		int number = (int) (Math.random() * 6 +1);
		if (number < 1) {
			number = 1;
		} else if (number > 6) {
			number = 6;
		}
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 2);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 2);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 2);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 2);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 2);
			break;
		case 6:
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 2);
			break;
		}
	}
	
	public static void RandomIncrease1() {
		int number = (int) (Math.random() * 6 +1);
		if (number < 1) {
			number = 1;
		} else if (number > 6) {
			number = 6;
		}
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 1);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			break;
		case 6:
			AbilityScores.setCharisma(AbilityScores.getCharisma() + 1);
			break;
		}
	}
	
	public static void RandomIncrease1HalfElf() {
		int number = (int) (Math.random() * 5 +1);
		if (number < 1) {
			number = 1;
		} else if (number > 5) {
			number = 5;
		}
		
		switch (number) {
		case 1:
			AbilityScores.setStrength(AbilityScores.getStrength() + 1);
			break;
		case 2:
			AbilityScores.setDexterity(AbilityScores.getDexterity() + 1);
			break;
		case 3:
			AbilityScores.setConstitution(AbilityScores.getConstitution() + 1);
			break;
		case 4:
			AbilityScores.setIntelligence(AbilityScores.getIntelligence() + 1);
			break;
		case 5:
			AbilityScores.setWisdom(AbilityScores.getWisdom() + 1);
			break;
		}
	}

	public static int getStrength() {
		return strength;
	}

	public static void setStrength(int strength) {
		AbilityScores.strength = strength;
	}

	public static int getDexterity() {
		return dexterity;
	}

	public static void setDexterity(int dexterity) {
		AbilityScores.dexterity = dexterity;
	}

	public static int getConstitution() {
		return constitution;
	}

	public static void setConstitution(int constitution) {
		AbilityScores.constitution = constitution;
	}

	public static int getIntelligence() {
		return intelligence;
	}

	public static void setIntelligence(int intelligence) {
		AbilityScores.intelligence = intelligence;
	}

	public static int getWisdom() {
		return wisdom;
	}

	public static void setWisdom(int wisdom) {
		AbilityScores.wisdom = wisdom;
	}

	public static int getCharisma() {
		return charisma;
	}

	public static void setCharisma(int charisma) {
		AbilityScores.charisma = charisma;
	}
}
