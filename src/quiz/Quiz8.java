package quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 1. int형 변수 x를 선언하고 80을 대입하세요
		// 논리연산자를 사용하여 x가 50<x<100 범위에 포함되는지 확인하세요
		// 논리곱
		int x = 80;
		boolean result1 = (x > 50) && (x < 100); // true && true
		System.out.println(result1); // true
		// x는 범위에 포함이 된다
		
		// 2. int형변수 y를 선언하고 5를 대입하세요
		// 논리연산자를 사용하여 y가 10보다 작거나 30보다 큰지 확인하세요
		// 논리합
		int y = 5;
		boolean result2 = (y < 10) || (y > 30); // true || false
		System.out.println(result2);
	}

}
