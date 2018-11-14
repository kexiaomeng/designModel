package proxy;

public class Proxy implements Subject{
	Subject subject;
	
	 public Proxy(Subject subject) {
		// TODO Auto-generated constructor stub
		 this.subject = subject;
	}
	@Override
	public void doSomeThing() {
		// TODO Auto-generated method stub
		subject.doSomeThing();
	}

}
