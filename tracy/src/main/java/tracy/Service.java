package tracy;

import org.springframework.stereotype.Component;

@Component
public class Service {

	@Action(name="ע��ʽ����")
	public void add() {
		System.out.println("addddddddddddddddd");
	}
}
