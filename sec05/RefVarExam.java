package sec05;

public class RefVarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1; //�迭���� arr1 ����
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; //�迭 {1, 2, 3}{1, 2, �� ������ ������ �� �迭�� arr1�� ����
		arr2 = new int[] {1, 2, 3}; //�迭 3}�� ������ ������ �� �迭�� arr2�� ���� 
		arr3 = arr2; // �迭���� arr2�� ���� arr3�� ����
		
		System.out.println(arr1 == arr2); //new�� ���ο� ��ü�� ������̱⶧���� ���� �ٸ���!
		System.out.println(arr2 == arr3); //���� ��ü�� ���� ������ ���� !
	}

}
