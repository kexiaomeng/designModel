package com.sun.observe;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	protected String action;
	private List<Observe> observes = new ArrayList<>();
	
	
	public void addObserver(Observe obserbe) {
		observes.add(obserbe);
	}
	
	public void delObserver(Observe obserbe) {
		observes.remove(obserbe);
	}
	
	public void notify1() {
		for (Observe observe : observes) {
			observe.update();
		}
	}

	
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	
	
}
