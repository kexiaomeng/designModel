package decorator.obj;

import decorator.IComponent;

public class ComponentObj implements IComponent{
	
	@Override
	public void doSomeThing() {
		System.out.println("I do");
	}
}
