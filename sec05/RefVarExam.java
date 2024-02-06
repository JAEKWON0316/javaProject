package sec05;

public class RefVarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1; //배열변수 arr1 선언
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3}; //배열 {1, 2, 3}{1, 2, 을 생성한 다음에 그 배열을 arr1에 저장
		arr2 = new int[] {1, 2, 3}; //배열 3}을 생성한 다음에 그 배열을 arr2에 저장 
		arr3 = arr2; // 배열변수 arr2의 값을 arr3에 대입
		
		System.out.println(arr1 == arr2); //new로 새로운 객체를 만드것이기때문에 서로 다르다!
		System.out.println(arr2 == arr3); //같은 객체를 쓰고 있으니 같다 !
	}

}
