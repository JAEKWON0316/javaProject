package lesson0101;

public class LiteralExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int var1 = 10;
          System.out.println(var1);
          
          int var2 = 010;  // 1X8(1) + 0X8(0��) = 8
          System.out.println(var2);
          
          int var3 = 0x10; // 1X16(1��) + 0X16(0��) = 16
          System.out.println(var3);
          
          double var4 = 0.25;  //�Ǽ����ͷ�(double)
          System.out.println(var4);  
          
          double var5 = 2E5;
          System.out.println(var5);  //�Ǽ� Ÿ�� .0�� �������� ��������
          
          char var6 = 'A';  //���� �ϳ��ϳ��� charŸ������ ����
          System.out.println(var6);
          
          char var7 = '��';
          System.out.println(var7);
          System.out.println('\t' + "�鿩���� ����");
          System.out.println('\n' + "�鿩���� ����");   
	}
}
  			