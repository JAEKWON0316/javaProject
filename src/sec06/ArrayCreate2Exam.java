package sec06;

public class ArrayCreate2Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭 ������ ����
		int[] scores;
		
		//�迭 ������ ����, ����, ���� ������ ����
		scores = new int[] {90, 95, 94}; //new�� �Ἥ �������� ������ ���������Ѵ�.
		for (int i = 0; i < scores.length; i ++) {
			//System.out.println(scores[i]);
		}
		printScores(new int[] {67, 66, 80});
	}
	//printScores ��� �޼ҵ带 ����
	public static void printScores(int[] scores) { //void�� ����Ÿ��X
		//�Ű������� �����ϴ� �迭�� �׸��� ���
		for(int i = 0; i < 3; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
}
