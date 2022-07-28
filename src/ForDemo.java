
public class ForDemo {
	public static void main(String[] args) {
//		for(int i=1;i<=10;i++) {
//			System.out.print(i+"\t");
//		}
//		System.out.print("\n");
//		for(int i = 10;i>0;i--) {
//			System.out.print(i+"\t");
//		}
//		System.out.print("\n");
//		for(int i = 1; i<=20; i++) {
//			if(i%3==0) {
//				System.out.print(i+"\t");
//			}
//		}
		int count = 0;
		for(int i = 20; i<=180; i++) {
			if(i%7==0) {
				System.out.print(i+"\t");
				count++;
				if(count==5) {
					System.out.println();
					count = 0;
				}
			}
		}
	}
}
