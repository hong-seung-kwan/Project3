package quiz;

public class Quiz3 {

	public static void main(String[] args) {
		
		// 변수 num을 선언하고 456을 저장하세요.
		// 그리고 백의 자리 이하를 버린 값을 구하세요.
		// 456 -> 400
		int num = 456;
		System.out.println(num/100); //4
		System.out.println(num/100*100); //400
		
		System.out.println(num-(num%100)); //400
		
//		int result1 = num - num % 100;
//		int result2 = num / 100 * 100;
//		
//		
//		System.out.println(result1);
//		System.out.println(result2);
		
	}

}
