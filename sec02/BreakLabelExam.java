package sec02;

public class BreakLabelExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer: for(char upper='A'; upper <= 'Z'; upper++) {
			for(char lower ='a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break Outer;   //Outer는 이름명이고 내가 정할 수 있다. 이렇게 해주면 처음for문도 1번만 돌고 break된다.
				}
			}
		}
	}

}
