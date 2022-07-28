import java.util.Scanner;
import java.util.GregorianCalendar;
public class OpDemo {
	public static void main(String[] args) {
		System.out.println(5/2);
		System.out.println(5%2);
		System.out.println(32767<<5);
		System.out.println(Integer.toBinaryString(-32767));
		System.out.println(Integer.toBinaryString(-32767>>5));
		System.out.println(Integer.toBinaryString(-32767>>>5));
		System.out.println(Integer.toBinaryString(134216704));
		System.out.println(Integer.toBinaryString(-32767<<5));
		System.out.println(Integer.toBinaryString(5&4));
		System.out.println(Integer.toBinaryString(5|4));
		System.out.println(Integer.toBinaryString(5^4));
		System.out.println(true&&false);
		System.out.println(true||false);
		int a=5;
		int b=10;
		int x=15;
		if(a>x & ++b<x) { //비트연산자 기준으로 생각을 하게 되면 이 값은 0이 나오고 이걸 true 또는 false 로 생각을 하여 조건문에 0이 들어오면 아래 문장을 실행되지 않는 것 같음 
			              // -> 이렇게 생각하게된 이유는 반대로 비트연산자 자리에 논리연산자를 쓰게 되면 사용이 불가능 하기 때문이다.
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		System.out.println(b);
		
		if(true) {
			System.out.println("참");
		}
		else {
			System.out.println("거짓");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개를 입력하시오:");
		int su = sc.nextInt();
		
		if(su%2==0)System.out.println("짝수이군요.");
		else System.out.println("홀수이군요.");
		
		System.out.println((su%2==0)?"짝수이군요":"홀수이군요");
		
		int near = sc.nextInt();
		System.out.println((near%4==0)&&(near%100!=0)||(near%400==0)?"윤년":"윤년X");
		
		System.out.println("연도를 입력하시오.");
		int year = sc.nextInt();

		GregorianCalendar gc = new GregorianCalendar();
		if (gc.isLeapYear(year)) {
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
		
		int yearday = sc.nextInt();
		yearday%=100;
		if(yearday==29) {
			
		}
	}
}
