package tracy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.security.Init;


public class Service {

	public void init() {
		System.out.println("��ʼ��");
	}
	@Action(name="ע��ʽ����")
	public void add() {
		System.out.println("addddddddddddddddd");
	}
	
	public void destroy() {
		System.out.println("����");
	}
}
