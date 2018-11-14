package decorator.decorator;

import decorator.IComponent;

public class DecoratorB implements IComponent{
	private IComponent component;
	
	public DecoratorB(IComponent component) {
		// TODO Auto-generated constructor stub
		this.component = component;
	}
	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		System.out.println("I AM DECORATOR_B");
		component.doSomeThing();
		
	}

}
