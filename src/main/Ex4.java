package main;

// 산술 연산자의 계산 과정
public class Ex4 {

	public static void main(String[] args) {

		// 성적 구하기
		int math = 93;
		int eng = 70;

		// 총점과 평균 구하기
		int sum = math + eng;
		System.out.println(sum); // 163

		// 평균 ? 81.5

		// int/int => int
		System.out.println(sum / 2); // 81

		// 컴퓨터는 계산을 하기전에 두 항의 타입을 일치시킨다! ! !
		// int/float => float/float = 163.0 / 2.0 = 81.5
		System.out.println(sum / 2.0); // 81.5

		// float/int => float/float = 163.0 / 2.0 = 81.5
		System.out.println((float) sum / 2); // 81.5
	}

}
