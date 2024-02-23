package sec02;

public class SmartPhoneExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 생성
		SmartPhone myPhone = new SmartPhone("갤럭시", "핑크골드"); //SmartPhone만 객체화 해도 SmartPhone은 Phone을 상속했기 때문에 Phone도 자동으로 객체화된다.
		
		//Phone으로 부터 상속받은 필드를 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		//SmartPhone 필드
		System.out.println("와이파이 상태 : " + myPhone.wifi); //wifi초기화를 안했으니 기본값 false가 나온다.
		
		//Phone으로 부터 상속 받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요? 좋은 대출 상품이 있어 전화드렸어요.");
		myPhone.sendVoice("제가 지금 바뻐요. 끊어요.");
		myPhone.hangUp();
		
		//SmartPhone 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
