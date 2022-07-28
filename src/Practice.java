import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year : ");
		int year = sc.nextInt();
		
		System.out.print("Year : ");
		int month = sc.nextInt();
		
		if(month==2) {
			if(year%400==0||(year%4==0&&year%100!=0)) {
				System.out.println("마지막날은 29일입니다.");
			}else {
				System.out.println("마지막날은 28일입니다.");
			}
		}
		else if(month!=2) {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
				System.out.println("마지막날은 31일입니다.");
			}else {
				System.out.println("마지막날은 30일입니다.");
			}
		}
	}
}
