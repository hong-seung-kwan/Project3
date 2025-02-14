package main;

// 논리 연산자
public class Ex6 {

	public static void main(String[] args) {
		
		// 논리곱: 두 식이 모두 참이면 결과는 참 (그리고, and)
		// 두항: boolean 
		// 결과: boolean
		boolean result1 = (5 > 0) && (10 > 0); // true
		boolean result11 = true && true;
//		boolean result111 = 1 && 10;
		
		boolean result2 = (5 > 0) && (10 < 0); // true && false
		//System.out.println(result2); // false
		
		
		// 논리합: 두항 중 하나라도 참이면 결과는 참 (또는, or)
		boolean result3 = (5 > 0) || (10 > 0); // true || true
		System.out.println(result3); // true
		
		boolean result4 = (5 > 0) || (10 < 0); // true || false
		System.out.println(result4); // true
		
		// x가 5보다 크거나 또는 10보다 작아야한다
		
		// 부정 연산자: boolean 값을 반대로
		// true -> false false-> true
		boolean result5 = !(5 > 0); // !true => false
		boolean result55 = !true; // false
		
	}

}
