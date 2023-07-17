package section03;
/*
 * 연산자 (Operator)
 * 	프로그램에서 데이터를 처리하여 신출하는 것을 연산(operation)
 * 	연산에 사용되는 표시나 기호를 연산자 (operator)라고 한다.
 * 	
 * 1. 산술연산자
 * 	+ - * / %
 * 
 */

public class Operator01 {
	public static void main(String[] args) {
		int num1=10;
		int num2=5;
		//두수의 합(정수)= 정수 + 정수
		int Sum=num1+num2;
		System.out.println("sum : "+Sum); //문자열  숫자-> 값이 연결된 문자열
		
		//숫자 + 문자열은 문자열이다.
		//문자열 '+' 연결연산자이다.
		String result = num1+"+"+num2+"="+sum;
		System.out.println(result);
		
		//두수의 곱하기
		int multiply = num1*num2;
		System.out.println("multiply : " +multiply);
		
		//나누기
		int devide = num1/num2;
		System.out.println("devide : "+devide);
		
		//나머지
		int resultNum=9%5;
		System.out.println("9 % 5 = "+resultNum);
	}

}
