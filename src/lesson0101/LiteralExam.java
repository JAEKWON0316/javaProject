package lesson0101;

public class LiteralExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int var1 = 10;
          System.out.println(var1);
          
          int var2 = 010;  // 1X8(1) + 0X8(0승) = 8
          System.out.println(var2);
          
          int var3 = 0x10; // 1X16(1승) + 0X16(0승) = 16
          System.out.println(var3);
          
          double var4 = 0.25;  //실수리터럴(double)
          System.out.println(var4);  
          
          double var5 = 2E5;
          System.out.println(var5);  //실수 타입 .0이 마지막에 찍혀나옴
          
          char var6 = 'A';  //문자 하나하나는 char타입으로 설정
          System.out.println(var6);
          
          char var7 = '한';
          System.out.println(var7);
          System.out.println('\t' + "들여쓰기 문자");
          System.out.println('\n' + "들여쓰기 문자");   
	}
}
  			