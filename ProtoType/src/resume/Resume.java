package resume;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String addr;
//	Object object;
	public Resume(String name) {
		this.name = name;
//		objecst = new Object();
	}
	
	public void display(){
		System.out.println(this.name+this.addr);
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public static void main(String[] args) {
		Resume a = new Resume("sun");
		a.setAddr(" 111");
		Resume b = a.deepclone();
		b.setAddr("222");
//		System.out.println(a.object == b.object);
		Resume c = a;
		a.display();
		b.display();
		c.display();
	}
	
	
	public Resume deepclone() {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ObjectOutputStream obj = new ObjectOutputStream(out);
			obj.writeObject(this);
			
			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			ObjectInputStream objin = new ObjectInputStream(in);
			return (Resume)objin.readObject();

//			return (Resume)super.clone();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return null;
		}
	}
}
