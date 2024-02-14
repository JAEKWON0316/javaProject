package sec08;

import java.util.Calendar;

public class EnumClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Week today = null;
		//컴퓨터에 있는 날짜, 요일, 시간 등을 얻으려면 java.util.Calendar를 이용한다.
		//java.util.GregorianCalendar
		//Week today = Week.WENDESDAY; //이렇게 enum안에 값을 가져올 수 있다.(열거 타입은 다 대문자를 쓴다.)
		//enum(열거타입)은 대문자로 쓴다. 복합단어의 경우 스네이크표기법을 이용한다.(EX: YEAR_MONTH)
		Calendar now = Calendar.getInstance(); //now란 변수에 Calendar 정보(Instance)를 넣는다.
		
		int year = now.get(Calendar.YEAR); //지금 년도
		int month = now.get((Calendar.MONTH) +1); //월 (0~11)
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 (1~7);
		int hour = now.get(Calendar.HOUR); //시간
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초
		
		//숫자를 열거상수로 변환해서 변수에 저장
		switch(week) {
		case 1:
			today = Week.일요일; 
					break;
		case 2:
			today = Week.월요일; 
					break;
		case 3:
			today = Week.화요일; 
					break;
		case 4:
			today = Week.수요일; 
					break;
		case 5:
			today = Week.목요일; 
					break;
		case 6:
			today = Week.금요일; 
					break;
		case 7:
			today = Week.토요일; 
					break;
		}
		System.out.println(today);
		if(today == Week.일요일) {
			System.out.println("일요일에 축구를 봅니다.");
		}
		else if(today == Week.수요일) {
			System.out.println("자바공부를 댑따 합니다.");
		}
		else {
			System.out.println("다른 요일에도 자바 공부만 합니다.");
		}
	}

}
