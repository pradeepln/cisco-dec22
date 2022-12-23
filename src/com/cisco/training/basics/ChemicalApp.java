package com.cisco.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		ChemicalElement h = new ChemicalElement(1, "Hydrogen", "H");
		ChemicalElement k = new ChemicalElement(19, "Potassium", "K");
		
		displayDetails(o);
		displayDetails(h);
		displayDetails(k);
	
		// Immutable
//		o.atomicNumber = 25;
//		o.setAtomicNUmber(25);
		
		ChemicalElement o2 = new ChemicalElement(8, "Oxygen", "O");
		System.out.println("O == O2 ? "+(o == o2));
		System.out.println("O .equals O2 ? "+(o.equals(o2)));
	}

	private static void displayDetails(ChemicalElement c) {
		
		//c.atomicNumber = -1;
		
//		System.out.println("Element with name : "+c.name);
//		System.out.println("\t is it Alkali? "+c.isAlkaliMetal());
//		System.out.println("\t is it Metal? "+c.isMetal());
//		System.out.println("\t is it \"Transition\" Metal? "+c.isTransitionMetal());
		
		String displayText = """
				Element with name : %s
					is it Alkali? %s
					is it Metal? %s
					is it "Transition" Metal? %s
				""".formatted(c.getName(),c.isAlkaliMetal(),c.isMetal(),c.isTransitionMetal());
		
		System.out.println(displayText);

	}

}
