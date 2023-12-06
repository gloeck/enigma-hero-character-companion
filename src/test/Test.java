package test;

import character.PlayerCharacter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerCharacter pc1 = new PlayerCharacter("teste", 10, 2);
		
		System.out.println(pc1.getStrength());
		System.out.println(pc1.getDexterity());
		System.out.println(pc1.getConstitution());
		System.out.println(pc1.getIntelligence());
		System.out.println(pc1.getWisdom());
		System.out.println(pc1.getCharisma());
		System.out.println(pc1.CalculateAbilityScoreModifier(pc1.getCharisma()));
		
	}

}
