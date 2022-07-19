package week4;

public class FanXing1<T> {

	private T name;
	private T price;

	public FanXing1() {
	}

	public FanXing1(T name, T price) {
		this.name = name;
		this.price = price;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public T getPrice() {
		return price;
	}

	public void setPrice(T price) {
		this.price = price;
	}

	public static void main(String[] args) {
		FanXing1<String> fruit = new FanXing1<String>();
		fruit.setName("Apple");
		String myFruit = fruit.getName();
		System.out.println("Name:" + myFruit);
	}
}