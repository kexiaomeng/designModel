package com.sun.observe.subject;

import com.sun.observe.Subject;

public class BossSubject extends Subject{
	
	
	
	@Override
	public String getAction() {
		return action;
	}

	@Override
	public void setAction(String action) {
		this.action = action;
	}
	
}
