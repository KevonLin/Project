package j2se;

public class Hero {

	String name;

	float hp;

	float armor;// ����

	int moveSpeed;
	
	float getArmor() {
		return armor;
	}
	
	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}
	
	void addSpeed(int speed) {
		moveSpeed += speed;
	}

	void legendary() {
		System.out.println("����");
	}
	
	float getHp() {
		return hp;
	}
	
	void recovery(float blood) {
		hp += blood;
	}

}
