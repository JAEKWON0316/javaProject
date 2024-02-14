package sec08;

public class ArrayCopyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//길이가 3인 배열을 만듦
		String[] oldStrArr = {"java", "javaScript", "mysql"};
	
		//길이가 5인 배열을 만듦
		String[] newStrArr = new String[5];
		
		//길이가 3인 배열의 항목을 5인 배열에 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		for(int i = 0; i < newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++++++");
		for(String str : newStrArr) {
			System.out.print(str + ", ");
		}
	}

}
