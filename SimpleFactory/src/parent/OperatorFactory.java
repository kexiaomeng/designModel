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
			return "没有对应的操作";
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入操作数A");

		while(scanner.hasNext()) {
			String strA = scanner.nextLine();
			System.out.println("请输入操作数B");

			String strB = scanner.nextLine();
			System.out.println("请输入运算符");
			String op = scanner.nextLine();
			
			Object object = OperatorFactory.getOperator(op, strA, strB);
			
			if (object instanceof Operator) {
				System.out.println(((Operator)object).getResult());
				
			}else {
				System.out.println(object.toString());
			}
			
			System.out.println("请输入操作数A");



			
		}
	}
}
