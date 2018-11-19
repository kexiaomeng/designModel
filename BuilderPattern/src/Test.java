import com.sum.builder.parttern.builder.CleverBody;
import com.sum.builder.parttern.builder.Ibuilder;
import com.sum.builder.parttern.director.Director;

public class Test {

	public static void main(String[] args) {
		Ibuilder ibuilder  = new CleverBody();
		Director director = new Director(ibuilder);
		
		director.printResult();
	}

}
