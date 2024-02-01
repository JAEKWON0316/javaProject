package class01;

public class SingleOpExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = -100;
//		x = -x;
//		System.out.println("x : " + x);
//		
//		byte b = 100;
//		//byte y = -b; //컴파일 에러 why? -부호도 연산이기 때문에 결과는 int로 해야한다.
//		int y = -b;
//		System.out.println("y + " + y);
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x = " + x);	
		System.out.println("-----------");
		
		y--;
		--y;
		System.out.println("y = " + y);
		System.out.println("-----------");
		
		
		z = ++x; //x를 증감연산자로 먼저 +1 해준다음에 z에 대입연산
		System.out.println("z = " + z);
		System.out.println("x = " + x);
		System.out.println("-----------");
		
		z = x++;
		System.out.println("z = " + z); //z에 x증감연산 전에 넣어서 13
		System.out.println("x = " + x); //x는 z에 13대입후 증감연산돼서 14
		System.out.println("-----------");
		
		z = ++x + y++;
		System.out.println("z = " + z); //13+1 + 8 == 22
		System.out.println("x = " + x);
		System.out.println("y = " + y); // z에 대입 연산후 y++해줬음으로 9
		
	}

}
