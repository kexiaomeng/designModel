import com.sun.observe.Observe;
import com.sun.observe.Subject;
import com.sun.observe.observer.CartoonObserver;
import com.sun.observe.observer.NBAObserver;
import com.sun.observe.subject.BossSubject;

public class Test {
	public static void main(String[] args) {
		Subject subject = new BossSubject();
		
		Observe observe = new NBAObserver("ZHANG", subject);
		
		Observe observe2 = new CartoonObserver("SUN", subject);
		
		subject.addObserver(observe);
		subject.addObserver(observe2);
		
		subject.setAction("boss come in");
		subject.notify1();
	}
}
