package child;

import parent.Operator;

public class OperateMu extends Operator{

	public OperateMu(String opA, String opB) {
		strOpA = opA;
		strOpB = opB;
		
	}
	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		if (!isDigist(strOpA) ||  !isDigist(strOpB)) {
			return "操作数含有非数字";
		}
		return Double.valueOf(strOpA) * Double.valueOf(strOpB);
	}

}
