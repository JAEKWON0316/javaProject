package sec07;

public class BitShiftExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 1;
		int rs1 = num1 << 3;
		int rs2 = num1 * (int) Math.pow(2, 3); //1 X 2ÀÇ 3½Â
		System.out.println(rs1);
		System.out.println(rs2);
		
		int num2 = -8;
		int rs3 = num2 >> 3;
		int rs4 = num2 / (int) Math.pow(2, 3); // -8 / 2ÀÇ 3½Â
		System.out.println(rs3);
		System.out.println(rs4);
	}

}
