package proficiency;

import java.util.ArrayList;

public class RepositorySkill {
	private String name;
	private String ability;
	
	//
	
	public RepositorySkill(String name, String ability) {
		this.name = name;
		this.ability = ability;
	}
	
	public static ArrayList<RepositorySkill> RepositorySkillList() {
		ArrayList<RepositorySkill> skillList = new ArrayList<>();
		RepositorySkill acrobatics = new RepositorySkill("Acrobatics", "Dexterity");
		skillList.add(acrobatics);
		RepositorySkill animalHandling = new RepositorySkill("Animal Handling", "Wisdom");
		skillList.add(animalHandling);
		RepositorySkill arcana = new RepositorySkill("Arcana", "Intelligence");
		skillList.add(arcana);
		RepositorySkill athletics = new RepositorySkill("Athletics", "Strength");
		skillList.add(athletics);
		RepositorySkill deception = new RepositorySkill("Deception", "Dexterity");
		skillList.add(deception);
		RepositorySkill history = new RepositorySkill("History", "Intelligence");
		skillList.add(history);
		RepositorySkill insight = new RepositorySkill("Inssight", "Wisdom");
		skillList.add(insight);
		RepositorySkill intimidation = new RepositorySkill("Intimidation", "Charisma");
		skillList.add(intimidation);
		RepositorySkill investigation = new RepositorySkill("Investigation", "Intelligence");
		skillList.add(investigation);
		RepositorySkill medicine = new RepositorySkill("Medicine", "Wisdom");
		skillList.add(medicine);
		RepositorySkill nature = new RepositorySkill("Nature", "Intelligence");
		skillList.add(nature);
		RepositorySkill perception = new RepositorySkill("Perception", "Wisdom");
		skillList.add(perception);
		RepositorySkill performance = new RepositorySkill("Performance", "Charisma");
		skillList.add(performance);
		RepositorySkill persuasion = new RepositorySkill("Persuasion", "Charisma");
		skillList.add(persuasion);
		RepositorySkill religion = new RepositorySkill("Religion", "Intelligence");
		skillList.add(religion);
		RepositorySkill sleightOfHand = new RepositorySkill("Sleight of Hand", "Dexterity");
		skillList.add(sleightOfHand);
		RepositorySkill stealth = new RepositorySkill("Stealth", "Dexterity");
		skillList.add(stealth);
		RepositorySkill survival = new RepositorySkill("Survival", "Wisdom");
		skillList.add(survival);
		return skillList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbility() {
		return ability;
	}

	public void setAbility(String ability) {
		this.ability = ability;
	}
	
	
}
