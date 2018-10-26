package parent;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import child.OperateAdd;
import child.OperateMinus;
import child.OperateMu;

public class OperatorFactory {
	
	public static Object getOperator(String operator, String opA, String opB) {
		
		switch (operator) {
		case "+":
			return new OperateAdd(opA, opB);
		case "-":
			return new OperateMinus(opA, opB);
		case "*":
			return new OperateMu(opA, opB);
		default:
			return "û�ж�Ӧ�Ĳ���";
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�����������A");

		while(scanner.hasNext()) {
			String strA = scanner.nextLine();
			System.out.println("�����������B");

			String strB = scanner.nextLine();
			System.out.println("�����������");
			String op = scanner.nextLine();
			
			Object object = OperatorFactory.getOperator(op, strA, strB);
			
			if (object instanceof Operator) {
				System.out.println(((Operator)object).getResult());
				
			}else {
				System.out.println(object.toString());
			}
			
			System.out.println("�����������A");



			
		}
	}
}
