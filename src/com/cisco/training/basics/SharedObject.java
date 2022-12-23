package com.cisco.training.basics;

public class SharedObject {
	
	ChemicalElement c = new ChemicalElement(1, "Hydrogen", "H");
	
	
	public void thisMethodWillBeCalledFromMultipleThreads() {
		//complex logic
		if(c.isAlkaliMetal()) {
			//logic
		}
	}

}
