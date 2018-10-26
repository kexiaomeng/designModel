package child;

import parent.Operator;

public class OperateMinus extends Operator{

	public OperateMinus(String opA, String opB) {
		strOpA = opA;
		strOpB = opB;
		
	}
	@Override
	public Object getResult() {
		// TODO Auto-generated method stub
		if (!isDigist(strOpA) ||  !isDigist(strOpB)) {
			return "���������з�����";
		}
		return Double.valueOf(strOpA) - Double.valueOf(strOpB);
	}

}
