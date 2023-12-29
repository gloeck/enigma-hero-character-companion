package proficiency;

import java.util.ArrayList;

public class Language {
	private ArrayList<String> name;

	//

	public Language(String name) {
		this.name.add(name);
	}
	
	public Language() {
		
		this.name = new ArrayList<>();
		//standard languages
				this.name.add("Dwarvish");
				this.name.add("Elvish");
				this.name.add("Giant");
				this.name.add("Gnomish");
				this.name.add("Goblin");
				this.name.add("Halfling");
				this.name.add("Orc");
				
				//exotic languages
				this.name.add("Abyssal");
				this.name.add("Celestial");
				this.name.add("Draconic");
				this.name.add("Deep Speech");
				this.name.add("Infernal");
				this.name.add("Primordial");
				this.name.add("Sylvan");
				this.name.add("Undercommon");
	}

	public ArrayList<String> LanguageList() {
				
		//standard languages
		name.add("Common");
		name.add("Dwarvish");
		name.add("Elvish");
		name.add("Giant");
		name.add("Gnomish");
		name.add("Goblin");
		name.add("Halfling");
		name.add("Orc");
		
		//exotic languages
		name.add("Abyssal");
		name.add("Celestial");
		name.add("Draconic");
		name.add("Deep Speech");
		name.add("Infernal");
		name.add("Primordial");
		name.add("Sylvan");
		name.add("Undercommon");
		
		return (name);
	}

	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

}
