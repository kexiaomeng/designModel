package decorator;

import decorator.decorator.DecoratorA;
import decorator.decorator.DecoratorB;
import decorator.obj.ComponentObj;

public class Test {
	public static void main(String[] args) {
		IComponent obj = new DecoratorA(new DecoratorB(new ComponentObj()));
		obj.doSomeThing();
	}
}
