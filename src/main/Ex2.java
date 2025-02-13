package main;

// 증감 연산자
public class Ex2 {

	public static void main(String[] args) {

		// 증감연산자는 원본값을 바꾼다

		// 변수 뒤에 있을때, 변수를 먼저 쓰고 값을 증가시킨다
//		int x = 100;
//		int y = x++; //값을 1만큼 증가시킨다 x = 101 y = 100
//		int z = x--; //값을 1만큼 감소시킨다 z = 101 x = 100
//		
//		System.out.println(x); // 100
//		System.out.println(y); // 100
//		System.out.println(z); // 101

		// 변수 앞에 있을때, 먼저 증가시키고 변수를 쓴다
		int x = 100;
		int y = ++x;
		int z = --x;
		System.out.println(x); // 100
		System.out.println(y); // 101
		System.out.println(z); // 100

	}

}
