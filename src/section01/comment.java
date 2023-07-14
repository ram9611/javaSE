package section01;
/*
 * 
 * ctrl + d : 줄삭제
 * ctrl + F11 : 실행단축키
 * ctrl + / : 주석 단축키
 * 
 * Alt + shift + j : javaDoc 주석 단축키
 * 
 */


public class comment {
	
	
	/**
	 * 
	 * 
	 * 
	 * @param printNum
	 */
	public static void main(String[] args) {
		//한줄 주석
		System.out.println("hello, java!");
		
		printNum(123);
	}
	
	public static void printNum(int num) {
		System.out.println("num:"+ num);
	}

}
