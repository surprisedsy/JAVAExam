package question1;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		String str;
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		str = scanner.next();
				
		IArithmetic arimetic = null;
		
		
		if(str.equals("+"))
			arimetic = new Add();
		else if(str.equals("-"))
			arimetic = new Sub();
		else if(str.equals("*"))
			arimetic = new Mul();
		else if(str.equals("/"))
			arimetic = new Div();		
		
		
		System.out.println(arimetic.calculation(a, b));
				
		scanner.close();
	}

}
