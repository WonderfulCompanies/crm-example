package org.wc;

public class Hello {

	private int i = 0;

	public String greet() {

		if (i == 1)
			return "Hola mundo";
		else
			return "Chau mundo";

	}

	public boolean isMonday() {
		return false;
	}
	
	public void setI(int i) {
		this.i = i;
	}

}
