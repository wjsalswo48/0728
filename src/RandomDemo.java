
public class RandomDemo {
	public static void main(String[] args) {
		int ran = (int)(Math.random()*6+1);// -> random()메소드는 1보다 작거나 같은 실수값이 나옴
		System.out.printf("%d",ran);
	}
}
