package main;

// 부호 연산자 ( + - )
public class Ex1 {

	public static void main(String[] args) {
		
		// + : 부호를 그대로 유지
		int num1 = 10;
		int num2 = -20;
		System.out.println(+num1); // 양 -> 양
		System.out.println(+num2); // 음 -> 음
		
		// - : 부호를 반대로 바꾸기
		System.out.println(-num1); // 양 -> 음
		System.out.println(-num2); // 음 -> 양
		
		System.out.println(num1); // 10
		System.out.println(num2); // -20
		// 부호연산자는 원본값에 영향이 없다
		// 부호연산자는 값을 카피해서 사용한다
		
		// 부호연산자
		System.out.println(+num1);
		
		// 더하기연산자
		System.out.println(num1 + num2);
		

	}

}
