package section07;
/*
 * OOP (Object Oriented Programming)
 * 	뜻 - 객체지향 프로그래밍
 *	프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드(함수)를 
 * 	하나의 논리적 단위로 객체로 묶는 단위
 * 
 * 객체(object)
 * 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것
 * 	정의 가능하고 식별 가능한 것을 말한다.
 * 
 * 	예) 물리적인 객체 - 컴퓨터, 휴대폰, 학생, 회원
 * 		추상적인 객체 - 주문 정보(영수증), 게임 유닛, 회계 장부
 * 
 * 	객체의 구성요소
 * 	1) 속성 -> 변수
 * 	2) 기능 -> 메서드
 *  
 *  ex) 자동차 객체
 *  	속성 1) 모델명 - 테슬라Y
 *  			가격 - 6000
 *  			색상 - red
 *  
 *  	기능 2) 자율주행()
 *  
 *  Class
 *  	객체를 만들기 위한 설계도 (붕어빵틀, 와플 기계)
 *  	Class에 작성된 코드를 읽어 인스턴스(객체)화 -> 메모리에 저장한다. or 올린다.
 *  
 * 클래스 구조
 *  (접근제한자) class 클래스명 (extends 상속) (implements 인터페이스 상속){
 *  	(생성자)=> 초기화
 *  	변수(멤버변수, 멤버 필드)=> 속성
 *  	메소드(멤버 메소드) => 기능
 *  
 *  }
 *  
 *  객체화 - new 연산자로 인스턴스화 가능!
 *  클래스명 변수명 = new 클래스();
 *  
 *  			
 */

public class OOP01 {
	public static void main(String[] args) {
		
		car car1= new car();
		car car2= new car();
		
		car2.color="blue";
		
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car1.wheel);
		System.out.println(car2.wheel);
		System.out.println(car1.model);
		System.out.println(car2.model);
		
		car1.autopilot();
		car1.drive();
		
	}

}
