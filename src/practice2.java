import java.util.*;
public class practice2 {
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*10+1);
		
		switch(num) {
		case 1:
			System.out.println("Bananas");break;
		case 2:
			System.out.println("Oranges");break;
		case 3:
			System.out.println("Peach");
		case 4:
			System.out.println("Apples");
		case 5:
			System.out.println("Plums");break;
		case 6:
			System.out.println("Pineaplies");break;
		case 7:
			System.out.println(" ");break;
			default:
				System.out.println("Nuts");
		}
	}
}
