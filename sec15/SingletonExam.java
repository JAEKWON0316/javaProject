package sec15;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton ton1 = new Singleton(); //필드가 private이기 때문에 외부에서 객체화 할 수 없어서 오류남
		//Singleton ton2 = new Singleton();
		
		//정적메소드를 호출해서 싱글톤 객체를 얻음
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1 == obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}
		else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}

}
