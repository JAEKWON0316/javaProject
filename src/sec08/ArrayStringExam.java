package sec08;

public class ArrayStringExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = new String[3];
		
		strArr[0] = "java";
		strArr[1] = "java";
		strArr[2] = new String("java");
		
		System.out.println("0�� : " + strArr[0]);
		System.out.println("1�� : " + strArr[1]);
		System.out.println("2�� : " + strArr[2]);
		
		System.out.println(strArr[0] == strArr[1]); //���� ��ü�� �ּҸ� ���� true
		System.out.println(strArr[0] == strArr[2]); //2�� ��ü�� �ٸ� �ּҿ� ������. false
		
		System.out.println(strArr[0].equals(strArr[2])); //���ڿ��� ����, �ٸ��� equals()�� ��
		
	}

}
