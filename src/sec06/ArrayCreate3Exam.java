package sec06;

public class ArrayCreate3Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열 선언과 생성
		int[] arr1 = new int[3];
		
		//초기값으로 세팅 (정수형타입 배열은 초기값 0)
		for(int i = 0; i < 3; i++) {
		System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		System.out.println("+++++++++++");
		arr1[0] = 20;
		arr1[1] = 40;
		for(int i = 0; i < 3; i++) {
			System.out.print(arr1[i] + ", ");
			
		}
		System.out.println();
		System.out.println("+++++++++++");
		
		double[] arr2 = new double[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println();
		System.out.println("+++++++++++");
		arr2[0] = 20.5;
		arr2[1] = 40.9;
		for(int i = 0; i < 3; i++) {
			System.out.print(arr2[i] + ", ");
		}
		System.out.println();
		System.out.println("+++++++++++");
		
		String[] arr3 = new String[4];
		for(int i =0; i < 4; i++) {
			System.out.print(arr3[i] + ", ");  //String타입 배열의 초기값은 null
		}
		System.out.println();
		System.out.println("+++++++++++");
		arr3[0] = "봄";
		arr3[1] = "여름";
		arr3[2] = "가을";
		for(int i =0; i < 4; i++) {
			System.out.print(arr3[i] + ", ");  
		}
		System.out.println();
		System.out.println("+++++++++++");
	}

}
