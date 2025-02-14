package main;

// 비교 연산자
public class Ex5 {

	public static void main(String[] args) {

		int x = 5;
		int y = 10;

		boolean result1 = (x > y);
		System.out.println("x가 y보다 큰지?" + result1); // false

		boolean result2 = (x >= y);
		System.out.println("x가 y보다 크거나 같은지?" + result2); // false

		boolean result3 = (x < y);
		System.out.println("x가 y보다 작은지?" + result3); // true

		boolean result4 = (x == y);
		System.out.println("x가 y가 같은지?" + result4); // false

		boolean result5 = (x != y);
		System.out.println("x가 y가 다른지?" + result5); // true

	}

}
