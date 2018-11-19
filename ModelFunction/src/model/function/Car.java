package model.function;

public abstract class Car {
	public final void driver() {
		openDoor();
		startEngine();
		
	}
	public abstract void openDoor();
	protected void startEngine() {
		System.out.println("start Engine");
	}
}
