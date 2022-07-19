package j2se;

public class Hero {

	String name;

	float hp;

	float armor;// »¤¼×

	int moveSpeed;
	
	float getArmor() {
		return armor;
	}
	
	void keng() {
		System.out.println("¿Ó¶ÓÓÑ£¡");
	}
	
	void addSpeed(int speed) {
		moveSpeed += speed;
	}

	void legendary() {
		System.out.println("³¬Éñ");
	}
	
	float getHp() {
		return hp;
	}
	
	void recovery(float blood) {
		hp += blood;
	}

}
