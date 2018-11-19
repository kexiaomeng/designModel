package com.sun.observe.observer;

import com.sun.observe.Observe;
import com.sun.observe.Subject;

public class NBAObserver extends Observe{

	public NBAObserver(String name, Subject subject) {
		super(name, subject);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("close NBA,"+subject.getAction());
		
	}


}
