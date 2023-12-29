package proficiency;

import character.CommonMethods;

public class Skill implements CommonMethods {

	private String name;
	private String Ability;
	
	//
	
	public Skill() {
		
	}

	@Override
	public int Random(double number) {
		return (int) (Math.random() * number);
	}
	
	public void RandomSkill() {
		RepositorySkill skill = RepositorySkill.RepositorySkillList().get(Random(RepositorySkill.RepositorySkillList().size()));
		this.setName(skill.getName());
		this.setAbility(skill.getAbility());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbility() {
		return Ability;
	}

	public void setAbility(String ability) {
		Ability = ability;
	}
	
	
}
