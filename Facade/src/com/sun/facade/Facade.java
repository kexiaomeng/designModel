package com.sun.facade;

import com.sun.facade.sub.system.SubSystemA;
import com.sun.facade.sub.system.SubSystemB;
import com.sun.facade.sub.system.SubSystemC;

public class Facade {
	private SubSystemA systemA;
	private SubSystemB systemB;
	private SubSystemC systemC;
	
	public Facade() {
		systemA = new SubSystemA();
		systemB = new SubSystemB();
		systemC = new SubSystemC();
	}
	
	
	public void methodA() {
		systemA.methodA();
		systemB.methodA();
		systemC.methodA();
	}
	
	
	public void methodB() {
		systemB.methodA();
		systemC.methodA();
		systemA.methodA();
	}
	
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		facade.methodA();
	}
}
