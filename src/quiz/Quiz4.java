package quiz;

public class Quiz4 {

	public static void main(String[] args) {
		
		// 수학, 영어, 국어의 점수가 각각 90, 70, 100일 때,
		// 이과목들의 총점과 평균을 구하세요
		
		int math = 90;
		int eng = 70;
		int kor = 100;
		
		// 총점
		int sum = math + eng + kor;
		System.out.println(sum);
		
		// 평균
		System.out.println(sum / 3);
		
		// 구하고 싶은값은 실수!
		// 계산과정도 실수로 계산해야함!
		System.out.println((float)sum / 3);
		
		System.out.println(sum / 3.0);
		
	}

}
