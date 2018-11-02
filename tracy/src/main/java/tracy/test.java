package tracy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(Config.class);
	
		Service service = configApplicationContext.getBean(Service.class);
		
		service.add();
		configApplicationContext.close();
	}
}
