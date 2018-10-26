package parent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Operator {
	protected String strOpA;
	protected String strOpB;
	
	public String getStrOpA() {
		return strOpA;
	}

	public void setStrOpA(String strOpA) {
		this.strOpA = strOpA;
	}

	public String getStrOpB() {
		return strOpB;
	}

	public void setStrOpB(String strOpB) {
		this.strOpB = strOpB;
	}


	public abstract Object getResult();
	
	public boolean isDigist(String str) {
		if(str==null || "".equals(str.trim())) { 
			return true;
		}
		Pattern pattern = Pattern.compile("[0-9]*.[0-9]*");
		Matcher isNum = pattern.matcher(str.trim());
		if(isNum.matches()){
			return true;
		}
		else{
			return false;
		} 
	}
}
