package test;

import java.util.ArrayList;

import character.AbilityScores;
import character.PlayerCharacter;
import race.Race;
import race.RepositoryRace;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlayerCharacter pc1 = new PlayerCharacter("teste", 10, 2);

				System.out.println(AbilityScores.getStrength());
				//System.out.println(AbilityScores.getDexterity());
				//System.out.println(AbilityScores.getConstitution());
				System.out.println(AbilityScores.getCharisma());
			
		System.out.println(pc1.getRace().getName() + "\n" + pc1.getRace().getSubrace() + "\n" + pc1.getRace().getRacialTraits() + "\n");
		pc1.ApplyRaceModifiers(pc1.getRace().getName());
		
		System.out.println(pc1.getRace().getName() + "\n" + pc1.getRace().getSubrace() + "\n" + pc1.getRace().getRacialTraits() + "\n");
		//System.out.println(AbilityScores.getStrength());
		//System.out.println(AbilityScores.getDexterity());
		//System.out.println(AbilityScores.getConstitution());
		
		System.out.println("Força" + AbilityScores.getStrength());
		System.out.println("Carisma" + AbilityScores.getCharisma());
	}
}