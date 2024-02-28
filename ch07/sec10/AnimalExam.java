package ch07.sec10;

public class AnimalExam {
	
	//�������� �̿��� ���
	public static void animalSound(Animal animal) {  //���� �Ű��������� Dog���� ���簴ü�� Cat���� ���簴ü�� ��
		animal.sound();
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); Animal�� abstract�̱� ������(�߻� Ŭ����) ��üȭ �Ұ��� �ڽ�Ŭ�������� �������
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breathe(); //��ӹ��� animal �޼ҵ� ȣ��
		cat.sound(); //�θ� �߻�Ŭ�������� ���� �ϰ� cat(�ڽ�Ŭ����)���� �������� �������̵��� �޼ҵ� ����
		dog.breathe(); //��ӹ��� animal �޼ҵ� ȣ��
		dog.sound(); //�θ� �߻�Ŭ�������� ���� �ϰ� cat(�ڽ�Ŭ����)���� �������� �������̵��� �޼ҵ� ����
		
		animalSound(new Dog()); //Dog���� ���� ��ü�� �Ű�������
		animalSound(new Cat()); //Cat���� ���� ��ü�� �Ű�������
		
  }
}
