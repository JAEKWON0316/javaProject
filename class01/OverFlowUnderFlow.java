package class01;

public class OverFlowUnderFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte num = 127;
		num++;
		System.out.println(num);
		
		byte num2 = -128;
		num2--;
		System.out.println(num2);
		
		byte var1 = 125;
		for(int i = 0; i < 5; i++){
			var1++;
			System.out.println("var1 : " + var1);
		}
		System.out.println("----------------");
		
		byte var2 = -125;
		for(int i = 0; i < 5; i++) { //스코프 안에서만 변수가 작용함으로 위에 for문의 i와 다른 i이다!!
			var2--;
			System.out.println("var2 : " + var2);
		}
		
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);  //오버 플로우가 발생해서 이상한 값이 나온다.
		
		long z1 = (long) x * y;
		System.out.println(z1); //타입 변환을 정확히 해줘서 오버플로우, 언더플로우가 나오지 않도록 해야한다.
		
	}

}
