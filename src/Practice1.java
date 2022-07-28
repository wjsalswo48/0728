import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 출생연도를 입력하시오");
		int year = sc.nextInt();
		
		if(year%12==0) {
			System.out.println("원숭이 "+(2022-year+1));
		}
		else if(year%12==1) {
			System.out.println("닭 "+(2022-year+1));
		}
		else if(year%12==2) {
			System.out.println("개 "+(2022-year+1));
		}
		else if(year%12==3) {
			System.out.println("돼지 "+(2022-year+1));
		}
		else if(year%12==4) {
			System.out.println("쥐 "+(2022-year+1));
		}
		else if(year%12==5) {
			System.out.println("소 "+(2022-year+1));
		}
		else if(year%12==6) {
			System.out.println("호랑이 "+(2022-year+1));
		}
		else if(year%12==7) {
			System.out.println("토끼 "+(2022-year+1));
		}
		else if(year%12==8) {
			System.out.println("용 "+(2022-year+1));
		}
		else if(year%12==9) {
			System.out.println("뱀 "+(2022-year+1));
		}
		else if(year%12==10) {
			System.out.println("말 "+(2022-year+1));
		}
		else if(year%12==11) {
			System.out.println("양 "+(2022-year+1));
		}
	}
}
