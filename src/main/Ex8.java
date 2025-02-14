package main;

// 삼항 연산자
public class Ex8 {

	public static void main(String[] args) {
		
		int motherAge = 47;
		int fatherAge = 50;
		
		// 엄마 아빠 나이를 비교
		String str = (motherAge > fatherAge) ? "엄마" : "아빠";
		System.out.println(str); // 아빠
		
		
		char ch = (motherAge > fatherAge) ? 'm' : 'f';
		System.out.println(ch); // f
		
		int age = (motherAge > fatherAge) ? 1 : 2;
		System.out.println(age); // f
		
		boolean b = (motherAge > fatherAge) ? true : false;
		System.out.println(b); // f
	}

}
