package sec02;

public class FloatCounterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		
		for(double x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		//실수형은 부동소수점 때문에 for문은 정수형으로 써주는게 좋다!
	}

}
